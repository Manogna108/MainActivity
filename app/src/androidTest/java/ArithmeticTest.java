import com.example.mainactivity.Arithmetic;

import junit.framework.TestCase;
public class ArithmeticTest extends TestCase {
    Arithmetic a;
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }
    public void testArithmeticAdd() {
        assertEquals(a.add(), 5);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
