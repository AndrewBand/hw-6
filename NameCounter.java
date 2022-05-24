package module6.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NameCounter {
    public int count(String text) {
        String[] textInArr = text.split(" ");
        int count = 0;
        String regex = "^[A-Z]([a-z]+)$";
        Pattern pattern = Pattern.compile(regex);

        for ( String textInArrCell:textInArr) {
            Matcher matcher = pattern.matcher(textInArrCell);
            if (matcher.matches()) {
                count++;
            }
        }

        return count;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
