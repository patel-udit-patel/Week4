import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.advanced_junit_practice_problems.testing_date_formatterr.DateFormatter;
class DateFormatterTest {

    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    // Test for valid date formatting
    @Test
    void testValidDate() {
        assertEquals("15-02-2025", dateFormatter.formatDate("2025-02-15"), "The date should be formatted correctly.");
        assertEquals("01-01-2020", dateFormatter.formatDate("2020-01-01"), "The date should be formatted correctly.");
        assertEquals("31-12-2025", dateFormatter.formatDate("2025-12-31"), "The date should be formatted correctly.");
    }

    // Test for invalid date (wrong format)
    @Test
    void testInvalidDate() {
        assertNull(dateFormatter.formatDate("2025/02/15"), "The date format is invalid and should return null.");
        assertNull(dateFormatter.formatDate("20250215"), "The date format is invalid and should return null.");
        assertNull(dateFormatter.formatDate("15-02-2025"), "The date format is invalid and should return null.");
    }

    // Test for invalid date (incorrect day/month values)
    @Test
    void testInvalidDayOrMonth() {
        assertNull(dateFormatter.formatDate("2025-13-15"), "The month should be valid.");
        assertNull(dateFormatter.formatDate("2025-02-30"), "The day should be valid.");
    }
}

