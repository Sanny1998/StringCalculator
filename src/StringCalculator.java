import java.util.StringTokenizer;

public class StringCalculator {
    public static int add(String userGiven) throws Exception{
        final String delimiter = ",\n";
        StringTokenizer token = new StringTokenizer(userGiven,delimiter);
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
                if (Character.isDigit(nextToken)) { //If part is for integer value
                    if(stringToInt(thisToken) < 0){
                        throw new Exception("nagative value is not allowed");
                    }else {
                        int number = stringToInt(thisToken);
                        if(number > 1000){//By this value greater than 1000 ignored
                            sumOfString += 0;
                        }else{
                            sumOfString += number;
                        }
                    }
                }else if(Character.isLetter(nextToken)){ //Else if part is for character value
                    char value = Character.toLowerCase(nextToken);
                    int number = (int)value - 96;
                    sumOfString += number;
                }else{
                    sumOfString += 0;
                }
            }
        }
        return sumOfString;
    }
    public static int stringToInt(String string){
        return Integer.parseInt(string);
    }
}
