public class StringCalculator {
    public static int add(String userGiven){
        int sumOfString = 0;
        if(userGiven.isEmpty()){
            return 0;
        }else{
            sumOfString += Integer.parseInt(userGiven);
            return sumOfString;
        }
    }
}
