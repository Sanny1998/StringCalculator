import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String userGiven){
        StringTokenizer token = new StringTokenizer(userGiven,",");
        int sumOfString = 0;
        if(userGiven.isEmpty()){
            return 0;
        }else{
            while(token.hasMoreTokens()){
                //Variable thisToken contains the nextTOken of the StringTokenizer
                String thisToken = token.nextToken();

                //nextToken cotains the character value of the next token
                char nextToken = thisToken.charAt(0);

                //Character.isDigit():is boolean function which check value is digit or not
                if(Character.isDigit(nextToken)){
                    int number = Integer.parseInt(thisToken);
                    sumOfString += number;
                }else{
                    char value = Character.toLowerCase(nextToken);
                    int number = (int)value - 96;
                    sumOfString += number;
                }
            }
            return sumOfString;
        }
    }
}
