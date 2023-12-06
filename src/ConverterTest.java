import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    private static final double DELTA = 0.01;
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, Converter.celtofahr(0), DELTA);
        assertEquals(212, Converter.celtofahr(100), DELTA);
    }
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, Converter.fahrtocels(32), DELTA);
        assertEquals(100, Converter.fahrtocels(212), DELTA);
    }

    @Test
    void testNegativeTemperature() {
        assertEquals(-40, Converter.fahrtocels(-40), DELTA);
        assertEquals(-40, Converter.celtofahr(-40), DELTA);
    }
}