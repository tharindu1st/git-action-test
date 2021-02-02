import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorUtilTest {

    @Test
    public void testAdd() {
        long x = 1l;
        long y = 2l;
        Assert.assertEquals(CalculatorUtil.add(x,y),3);
    }
    @Test
    public void testAddNegative() {
        long x = 1l;
        long y = 2l;
        Assert.assertTrue(CalculatorUtil.add(x,y)!=4);
    }
}