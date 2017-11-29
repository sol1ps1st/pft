import org.junit.Assert;
import org.junit.Test;
import org.pft.Calc;

public class CalsTests {
    @Test
    public void testPlus1(){
        int a = 10; int b = 3;
        int actual = Calc.Plus(a,b);
        int expected = a + b;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMult1(){
        int a = 10; int b = 3;
        int actual = Calc.Mult(a,b);
        int expected = a * b;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiv(){
        int a = 10; int b = 3;
        double actual = Calc.Div(a,b);
        double expected = a / b;
        Assert.assertEquals(expected, actual, 0.0001);
    }

}
