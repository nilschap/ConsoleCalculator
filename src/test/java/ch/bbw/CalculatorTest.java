package ch.bbw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;


public class CalculatorTest {

    private Calculator testee;

    @Before
    public void setUp() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        //Test
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveok(){
        assertTrue(testee.subtraktion(25,10)==15);
    }

    @Test(expected=ArithmeticException.class)
    public void testDivisionDividingByZero() {
        assertTrue(testee.division(2,0)==0);
    }

    @Test
    public void testDivisionIsIndexOutOfBounds()
     throws IndexOutOfBoundsException {
         assertTrue(testee.division(2,0)==0);
    }
}