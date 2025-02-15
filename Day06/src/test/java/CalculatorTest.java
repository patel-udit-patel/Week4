import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.basic_junit_test.testing_a_calculator_class.Calculator;
class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(6, 4));
        assertEquals(0, calculator.add(3, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-4, calculator.subtract(3, 7));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(7, 0));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

