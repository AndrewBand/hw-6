package module6.hw6;

class PunctuationMarkCounter {
    public int count(String phrase){
String[] phraseInChar = phrase.split("");
int countSimbol = 0;

        for (String checed : phraseInChar) {
            if (checed.equals(".")) countSimbol++;
            if (checed.equals(",")) countSimbol++;
            if (checed.equals("/")) countSimbol++;
            if (checed.equals("!")) countSimbol++;
            if (checed.equals(":")) countSimbol++;
            if (checed.equals(";")) countSimbol++;
        }
        return countSimbol;
    }
}
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
