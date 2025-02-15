import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.example.basic_junit_test.testing_beforeeach_and_aftereach_annotations.DatabaseConnection;
class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnectionIsActive() {
        assertTrue(db.isConnected(), "Database should be connected.");
    }

    @Test
    void testDisconnectWorks() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected.");
    }
}

