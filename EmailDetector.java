package module6.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailDetector {


     public boolean isPresent(String text) {
         String regex = "^(.+)[A-Za-z0-9][A-Za-z0-9]@[A-Za-z0-9][A-Za-z0-9](.+)$";
         Pattern pattern = Pattern.compile(regex);
             Matcher matcher = pattern.matcher(text);


         return matcher.matches();
     }
}
class EmailDetectorTest {
    public static void main(String[] args) {
//        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";


        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("Npup as pi@b fyxog"));
    }
}