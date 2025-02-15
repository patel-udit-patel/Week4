import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.basic_junit_test.testing_exception_handling.MathUtils;
class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivideValid() {
        assertEquals(5, mathUtils.divide(10, 2));
        assertEquals(3, mathUtils.divide(9, 3));
        assertEquals(-4, mathUtils.divide(-8, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

