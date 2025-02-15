import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.advanced_junit_practice_problems.testing_user_resistration.UserRegistration;
class UserRegistrationTest {

    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    // Test for valid user registration
    @Test
    void testValidUserRegistration() {
        // No exception should be thrown for valid input
        assertDoesNotThrow(() -> userRegistration.registerUser("johnDoe", "john@example.com", "password123"));
    }

    // Test for invalid username (less than 3 characters)
    @Test
    void testInvalidUsername() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("JD", "john@example.com", "password123");
        });
        assertEquals("Username must be at least 3 characters.", exception.getMessage());
    }

    // Test for invalid email (missing '@' symbol)
    @Test
    void testInvalidEmailMissingAt() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("johnDoe", "johnexample.com", "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    // Test for invalid email (missing '.' symbol)
    @Test
    void testInvalidEmailMissingDot() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("johnDoe", "john@examplecom", "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    // Test for invalid password (less than 8 characters)
    @Test
    void testInvalidPassword() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("johnDoe", "john@example.com", "short");
        });
        assertEquals("Password must be at least 8 characters.", exception.getMessage());
    }

    // Test for null username
    @Test
    void testNullUsername() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser(null, "john@example.com", "password123");
        });
        assertEquals("Username must be at least 3 characters.", exception.getMessage());
    }

    // Test for null email
    @Test
    void testNullEmail() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("johnDoe", null, "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    // Test for null password
    @Test
    void testNullPassword() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("johnDoe", "john@example.com", null);
        });
        assertEquals("Password must be at least 8 characters.", exception.getMessage());
    }
}

