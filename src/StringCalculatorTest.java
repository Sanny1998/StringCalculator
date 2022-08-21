import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest{
    /*
    In this , we make init method so that we dont need to inititalize
    String calculator in every method,by init method it will create
    new object for StringCalculator
     */
    public StringCalculator calculator;
    @Before
    public void init(){
        calculator = new StringCalculator();
    }

    /*
    In this test we check,if string is null than it will give 0 or not
     */
    @Test
    public void emptyString()throws Exception {
        assertEquals(0, StringCalculator.add(""));
    }

    /*
    In this test i will check,if String has only one value than it will
    return that value as sum
     */
    @Test
    public void oneValueString()throws Exception{
        assertEquals(1, StringCalculator.add("1"));
    }

    /*
    In this test case we check ,if string has two digit than its sum
     */
    @Test
    public void twoValueString()throws Exception{
        assertEquals(3, StringCalculator.add("1,2"));
    }
    /*
    In this test we ckeck,if string has multiple digit than its sum
     */
    @Test
    public void multipleValueString()throws Exception{
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    /*
    In this i will test, if any char is present instead of integer than its
    sum
     */
    @Test
    public void stringValueWithCharAndInteger()throws Exception{
        assertEquals(213, StringCalculator.add("10,200,c"));
    }

    /*
    In this test ,if user enter nagative value in String
    then it will give exception
     */
    @Test
    public void nagativeValueParse()throws Exception {
         StringCalculator.add("-1");
    }

    /*
    In this test ,if user enters value greater than 1000 than it will
    ignore
     */
    @Test
    public void valueGreaterThan1000Ignore()throws Exception {
        assertEquals(30,StringCalculator.add("10,20,3000"));
    }

}