import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String userGiven){
        StringTokenizer token = new StringTokenizer(userGiven,",");
        int sumOfString = 0;
        if(userGiven.isEmpty()){
            return 0;
        }else{
            while(token.hasMoreTokens()){
                char nextToken = token.nextToken().charAt(0);
                if(Character.isDigit(nextToken)){
                    int number =  (int)nextToken-48;
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
