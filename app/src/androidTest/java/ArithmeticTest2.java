import com.example.mainactivity.Arithmetic;
import com.example.mainactivity.TaxArithmetic;

import junit.framework.TestCase;


public class ArithmeticTest2 extends TestCase {

    Arithmetic a;
    TaxArithmetic b;
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic(5, 10);
        b = new TaxArithmetic(5,10);
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
    public void testTaxCalculate() {
        assertEquals(TaxArithmetic.add(1,2), 3);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}