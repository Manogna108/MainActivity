import com.example.mainactivity.Arithmetic;

import junit.framework.TestCase;

/**
 * Created by wdumas on 2/24/2015.
 */
public class ArithmeticTest2 extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic(5, 10);
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 15);
    }

    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), -5);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 50);
    }

    public void testArithmeticDivide() {
        System.out.println(a.divide());
        assertEquals(a.divide(), 0.5);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}