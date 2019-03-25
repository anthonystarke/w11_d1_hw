import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before()
    {
        calc = new Calculator();
    }


    @Test
    public void calculatorAdd(){
        int expected = calc.add(4,1);
        assertEquals(5, expected);
    }

    @Test
    public void calculatorSubtract(){
        int expected = calc.subtract(5,3);
        assertEquals(2, expected);
    }

    @Test
    public void calculatorMultiply(){
        int expected = calc.multiply(5,5);
        assertEquals(25, expected);
    }

    @Test
    public void calculationDivide(){
        int expected = calc.divide(4,2);
        assertEquals(2, expected);
    }

}
