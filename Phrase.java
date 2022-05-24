package module6.hw6;

import java.util.Arrays;

class Phrase {
   private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String word:words ) {
            sb.append(word + " ");
        }
        return (sb.toString());
    }
}
class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma" , "shoto"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}