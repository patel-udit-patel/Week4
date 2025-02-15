import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.basic_junit_test.testing_string_utility_methods.StringUtils;
class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
        assertEquals("madam", stringUtils.reverse("madam"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("Hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals("", stringUtils.toUpperCase(""));
        assertNull(stringUtils.toUpperCase(null));
    }
}

