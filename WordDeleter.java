package module6.hw6;

import java.util.Arrays;

class WordDeleter {
    public String remove(String phrase, String[] words) {

        int arrLehg = phrase.split(" ").length;
        String[] phraseArr = phrase.split(" ");
        int index = 0;
        String finalPhrase = null;
        int wordsArrIndex = words.length;
        boolean[] testeEquals = new boolean[wordsArrIndex];
        boolean testChecker = false;
        StringBuilder sb = new StringBuilder();
//        System.out.println("Arrays = " + Arrays.toString(phraseArr));
//        System.out.println("words = " + Arrays.toString(words));
//        int k = 0;
//        int z = 0;
//        System.out.println("(phraseArr[" + k + "].equals(words[" + z + "])) = " + (phraseArr[k].equals(words[z])));
        for (int i = 0; i < arrLehg; i++) {
            for (int j = 0; j < wordsArrIndex; j++) {
                if ((phraseArr[i].equals(words[j]))) {
                    testeEquals[j] = true;
                }else {
                    testeEquals[j] = false;
                }
            }
            for (boolean testEqual : testeEquals) {
                testChecker = testChecker | testEqual;
            }
            if (!testChecker){
                phraseArr[index] = phraseArr[i];
                index++;
            }
            testChecker = false;
        }
        phraseArr = Arrays.copyOf(phraseArr, index);
//        System.out.println("Arrays.toString(phraseArr) = " + Arrays.toString(phraseArr));

        for (String phraseArrEs : (phraseArr)) {
            sb.append((phraseArrEs));
            sb.append(" ");
        }

//        System.out.println("SB = " + sb);
        finalPhrase = String.valueOf(sb).strip();
//        System.out.println("finalPhrase = " + finalPhrase);
        return finalPhrase;
    }

}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("ibfe evrudejy taizdop", new String[]{"ibfe", "is"}));

        //This Sparta
        // System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
