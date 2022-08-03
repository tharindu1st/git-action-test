import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorUtilTest {

    @Test
    public void testAdd() {
        long x = 1L;
        long y = 2L;
        Assert.assertEquals(CalculatorUtil.add(x, y), 3);
    }

    @Test
    public void testAddNegative() {
        long x = 1L;
        long y = 2L;
        Assert.assertFalse(CalculatorUtil.add(x, y) != 5);
    }
}
