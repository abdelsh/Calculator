import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    Calculator obj;

    @Test
    public void testSum(){
        obj=new Calculator();

        assertEquals(7, obj.sum(4,3));
    }
}
