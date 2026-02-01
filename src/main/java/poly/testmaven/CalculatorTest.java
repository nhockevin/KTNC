package poly.testmaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        // TestNG: assertEquals(actual, expected)
        Assert.assertEquals(cal.add(5, 5), 10);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(cal.subtract(10, 5), 5);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(cal.multiply(2, 3), 6);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(cal.divide(10, 2), 5);
    }

    // Kiểm tra lỗi chia cho 0 (Cú pháp TestNG rất ngắn gọn)
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        cal.divide(10, 0);
    }
}