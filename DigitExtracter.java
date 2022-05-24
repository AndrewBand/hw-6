package module6.hw6;


import java.util.Arrays;

class DigitExtracter {

    static boolean isNumeric(char c) {
        return (c >= '0' && c <= '9');
    }

    static boolean isNumericString(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (!isNumeric(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public int[] extract(String text) {
        int digitArrInd = text.split("").length;
        int[] digitArray = new int[digitArrInd];
        String[] innPhraseArray = text.split("");
        int digitArrayIndex = 0;

        for (int i = 0; i < digitArrInd ; i++) {
                if (isNumericString(innPhraseArray[i])){
                    digitArray[digitArrayIndex] = Integer.parseInt(innPhraseArray[i]);
                    digitArrayIndex++;
                }
        }
        digitArray = Arrays.copyOf(digitArray, digitArrayIndex);
        return digitArray;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}