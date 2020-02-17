import com.example.mainactivity.Arithmetic;

import junit.framework.TestCase;

public class OthersTest extends TestCase {
   Arithmetic a;
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }
    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), -5);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 50);
    }

    public void testArithmeticDivide() {
        assertEquals(a.divide(), 0.5);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }
}
