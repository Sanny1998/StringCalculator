import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    /*
    In this , we make init method so that we dont need to inititalize
    String calculator in every method,by init method it will create
    new object for StringCalculator
     */
    public StringCalculator calculator;
    public void init(){
        calculator = new StringCalculator();
    }

    /*
    In this test we check,if string is null than it will give 0 or not
     */
    @Test
    public void emptyString() {
        assertEquals(0,calculator.add(""));
    }

    /*
    In this test i check,if String has only one value than it will
    return that value as sum
     */
    @Test
    public void oneValueString(){
        assertEquals(1,calculator.add("1"));
    }

    /*
    In this test case we check ,if string has two digit than its sum
     */
    @Test
    public void twoValueString(){
        assertEquals(3,calculator.add("1,2"));
    }
}