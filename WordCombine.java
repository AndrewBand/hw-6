package module6.hw6;

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        char[] sourceWordArray = new char[sourceWord.length()];
//        char[] targetWordArray = new char[targetWord.length()];
        String[] targetWordArray = targetWord.split("");

        boolean[] checker = new boolean[targetWord.length()];

        outLoop:
        for (String targetWordArrayCell : targetWordArray) {
            if (sourceWord.toLowerCase().contains(targetWordArrayCell.toLowerCase())) {

            } else {

                return false;
            }
        }
        return true;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}