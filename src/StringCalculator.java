import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String userGiven){
        StringTokenizer token = new StringTokenizer(userGiven,",");
        int sumOfString = 0;
        if(userGiven.isEmpty()){
            return 0;
        }else{
            while(token.hasMoreTokens()){
                sumOfString += Integer.parseInt(token.nextToken());
            }
            return sumOfString;
        }
    }
}
