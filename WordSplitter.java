package module6.hw6;

import java.util.Arrays;
import java.util.Locale;

final class WordSplitter {

    public String[] split(String phrase){

        while(phrase.contains("  ")) {
            String replace = phrase.replace("  ", " ");
            phrase=replace;
        }
       String[] splitArray = new String[((phrase).strip().split(" ")).length];
       int index = ((phrase).strip().split(" ")).length;
        System.out.println("index = " + index);
        splitArray = (phrase.toLowerCase()).split(" ");
        return splitArray;
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}