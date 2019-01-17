package ch.bbw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;


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
    public void ArithmeticException()
     throws ArithmeticException {
         assertTrue(testee.division(2,1)==2);
    }

    @Test
    public void testprotectedsummeOk(){
        assertTrue(testee.protectedsumme(10,25)==35);
    }

    @Test
    public void testpublicsubtraktionOk(){
        assertTrue(testee.publicsubtraktion(25,10)==15);
    }


    //Hinzugefügt
    //Äquivalenzklassen Summe
    @Test
    public void testsummetwopositivOk(){
        assertTrue(testee.summe(10, 10)==20);
    }

    @Test
    public void testsummepositivnegativOk(){
        assertTrue(testee.summe(20,(-10))==10);
    }

    @Test
    public void testsummepositivnullOk(){
        assertTrue(testee.summe(20,0)==20);
    }

    @Test
    public void testsummepositivmaxintOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE,20)==Integer.MAX_VALUE+20);
    }

    @Test
    public void testsummeminintOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE,20)==Integer.MIN_VALUE+20);
    }

    @Test
    public void testsummeintmaxnullOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE,0)==Integer.MAX_VALUE+0);
    }

    @Test
    public void testsummeintminnullOk(){
        assertTrue(testee.summe(Integer.MIN_VALUE,0)==Integer.MIN_VALUE+0);
    }

    @Test
    public void testsummeintmaxnegativOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE,-10)==Integer.MAX_VALUE-10);
    }

    //Äquivalenzklassen Subtraction
    @Test
    public void testsubtraktiontwopositivOk(){
        assertTrue(testee.subtraktion(20, 10)==10);
    }

    @Test
    public void testsubtraktionpositivnegativOk(){
        assertTrue(testee.subtraktion(20,(-10))==30);
    }

    @Test
    public void testsubtraktionpositivnullOk(){
        assertTrue(testee.subtraktion(20,0)==20);
    }

    @Test
    public void testsubtraktionpositivmaxintOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE,20)==Integer.MAX_VALUE-20);
    }

    @Test
    public void testsubtraktionpositivintminOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE,20)==Integer.MIN_VALUE-20);
    }

    @Test
    public void testsubtrackionintmaxnullOk(){
        assertTrue(testee.subtraktion(Integer.MAX_VALUE,0)==Integer.MAX_VALUE+0);
    }

    @Test
    public void testsubtraktionintminnullOk(){
        assertTrue(testee.subtraktion(Integer.MIN_VALUE,0)==Integer.MIN_VALUE+0);
    }

    @Test
    public void testsubtraktionintmaxnegativOk(){
        assertTrue(testee.summe(Integer.MAX_VALUE,-10)==Integer.MAX_VALUE- 10);
    }


    //Äquivalenzklassen division
    @Test
    public void testdivisiontwopositivOk(){
        assertTrue(testee.division(20, 10)==2);
    }

    @Test
    public void testdivisionpositivnegativOk(){
        assertTrue(testee.division(20,(-2))==-10);
    }

    @Test
    public void testdivisionpositivnullOk(){
        assertTrue(testee.division(20,2)==10);
    }

    @Test
    public void testdivisionpositivmaxintOk(){
        assertTrue(testee.division(Integer.MAX_VALUE,20)==Integer.MAX_VALUE/20);
    }

    @Test
    public void testdivisionpositivintminOk(){
        assertTrue(testee.division(Integer.MIN_VALUE,20)==Integer.MIN_VALUE/20);
    }

    @Test
    public void testdivisionintmaxnullOk(){
        assertTrue(testee.division(Integer.MAX_VALUE,1)==Integer.MAX_VALUE/1);
    }

    @Test
    public void testdivisionintminnullOk(){
        assertTrue(testee.division(Integer.MIN_VALUE,1)==Integer.MIN_VALUE/1);
    }

    @Test
    public void testdivisionintmaxnegativOk(){
        assertTrue(testee.division(Integer.MAX_VALUE,10)==Integer.MAX_VALUE / 10);
    }





}
