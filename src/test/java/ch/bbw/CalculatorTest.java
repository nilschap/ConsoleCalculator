package ch.bbw;

import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOk() {
        //Test
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveok(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(25,10)==15);
    }

}