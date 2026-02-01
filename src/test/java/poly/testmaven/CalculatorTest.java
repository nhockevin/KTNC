package poly.testmaven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, cal.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, cal.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(4, 0);
        });
    }
    
    @Test
    void testAssertMore() {
        assertTrue(cal.add(1, 1) == 2);
        assertFalse(cal.subtract(5, 3) == 1);
        assertNotEquals(10, cal.multiply(2, 3));
    }

}
