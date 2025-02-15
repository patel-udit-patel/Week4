import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.advanced_junit_practice_problems.testing_password_strength_validator.PasswordValidator;
class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    // Test for valid password
    @Test
    void testValidPassword() {
        assertTrue(passwordValidator.isValid("Password1"), "Password should be valid.");
        assertTrue(passwordValidator.isValid("StrongPass123"), "Password should be valid.");
    }

    // Test for invalid passwords (less than 8 characters)
    @Test
    void testPasswordTooShort() {
        assertFalse(passwordValidator.isValid("Pass1"), "Password should be invalid (too short).");
    }

    // Test for invalid passwords (missing uppercase letter)
    @Test
    void testPasswordNoUppercase() {
        assertFalse(passwordValidator.isValid("password1"), "Password should be invalid (no uppercase).");
    }

    // Test for invalid passwords (missing digit)
    @Test
    void testPasswordNoDigit() {
        assertFalse(passwordValidator.isValid("Password"), "Password should be invalid (no digit).");
    }

    // Test for invalid passwords (missing both uppercase and digit)
    @Test
    void testPasswordNoUppercaseNoDigit() {
        assertFalse(passwordValidator.isValid("password"), "Password should be invalid (no uppercase or digit).");
    }

    // Test for null password
    @Test
    void testNullPassword() {
        assertFalse(passwordValidator.isValid(null), "Password should be invalid (null).");
    }
}

