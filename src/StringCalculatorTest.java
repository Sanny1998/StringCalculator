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
}