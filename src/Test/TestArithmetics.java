package Test;

import Calculation.Arithmetics;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0, 1);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(21.0, res, 1);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4.0, res, 1);
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 5);
        Assert.assertEquals(2.0, res, 1);
    }

    //    @Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test(timeout = 1000)
    public void testN() {
        a.div(10.0, 10.0);
    }
}
