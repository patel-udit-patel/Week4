import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.advanced_junit_practice_problems.testing_temperature_converter.TemperatureConverter;
class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    // Test Celsius to Fahrenheit conversion
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0.0), "0°C should be 32°F.");
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100.0), "100°C should be 212°F.");
        assertEquals(-40.0, temperatureConverter.celsiusToFahrenheit(-40.0), "-40°C should be -40°F.");
    }

    // Test Fahrenheit to Celsius conversion
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32.0), "32°F should be 0°C.");
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212.0), "212°F should be 100°C.");
        assertEquals(-40.0, temperatureConverter.fahrenheitToCelsius(-40.0), "-40°F should be -40°C.");
    }
}
