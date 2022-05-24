package module6.hw6;

 class PalindromeCounter {
    public int count(String phrase){
        int counterPalindrom = 0;
        String[] palindromeArr = phrase.toLowerCase().split(" ");
        for (String palindromeWord:palindromeArr) {
            String[] pallWordCharArr = palindromeWord.split("");
            int indChar = pallWordCharArr.length/2;
            boolean[] booleanPalindrom = new boolean[indChar];

            for (int i = 0 ; i < indChar ; i++ ) {
            booleanPalindrom[i] = pallWordCharArr[i].equals(pallWordCharArr[pallWordCharArr.length-1-i]);
            }
            boolean sumPallindrom = true;
            for (boolean pallBollCell:booleanPalindrom ) {
                sumPallindrom = sumPallindrom && pallBollCell;
            }

            if(sumPallindrom) counterPalindrom++;
        }
    return counterPalindrom;
    }
}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}