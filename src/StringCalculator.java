import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String userGiven)throws Exception{
        StringTokenizer token = new StringTokenizer(userGiven,",");
        int sumOfString = 0;
        if(userGiven.isEmpty()){
            return 0;
        }else {
            while (token.hasMoreTokens()) {
                //Variable thisToken contains the nextToken of the StringTokenizer
                String thisToken = token.nextToken();

                //nextToken contains the character value of the next token
                char nextToken = thisToken.charAt(0);

                //Character.isDigit():is boolean function which check value is digit or not
                if (Character.isDigit(nextToken)) {
                    if(stringToInt(thisToken) < 0){
                        throw new Exception("nagative value is not allowed");
                    }else {
                        int number = stringToInt(thisToken);
                        sumOfString += number;
                    }
                }else {
                    char value = Character.toLowerCase(nextToken);
                    int number = (int)value - 96;
                    sumOfString += number;
                    }
                }
        }
        return sumOfString;
    }
    public static int stringToInt(String string){
        return Integer.parseInt(string);
    }
}
