package module6.hw6;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class BigOrSmall {
    public String calculate(String text) {
        int countUpperLetter = 0;
        int countLowerLetter = 0;
        char[] textInArr = new char[text.length()];
        text.getChars(0, text.length(),  textInArr,  0);
        System.out.println("textInArr = " + Arrays.toString(textInArr));
        for (char textInnArrCell: textInArr) {

            if (  textInnArrCell >= 'A' && textInnArrCell <= 'Z' ) {
                countUpperLetter++;
                continue;
            }
            countLowerLetter++;
        }

//        String[] textInArr = Arrays.toString(text.getBytes()).substring(1, Arrays.toString(text.getBytes()).length()-1).split(", ");
//        System.out.println("textInArr = " + Arrays.toString(textInArr));
//        for (String textInnArrCell: textInArr) {
//
//            if (  Integer.parseInt(textInnArrCell) >= 65 && Integer.parseInt(textInnArrCell) <= 90 ) {
//                countUpperLetter++;
//                continue;
//            }
//            countLowerLetter++;
//        }
        System.out.println("countUpperLetter = " + countUpperLetter);
        System.out.println("countLowerLetter = " + countLowerLetter);
        if(countLowerLetter > countUpperLetter) return "Small";
        if(countLowerLetter < countUpperLetter) return "Big";
        return "Same";
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        System.out.println("getB UTF_8) AZaz= " + Arrays.toString("AZaz".getBytes(StandardCharsets.UTF_8)));
        System.out.println("getBytes()) AZaz= " + Arrays.toString("AZaz".getBytes()));
        char x = 'Z';
        int y = x - '0';
        System.out.println("y = " + y);
        System.out.println("Character.getNumericValue(" + x + ")= " + Character.getNumericValue(x));
        System.out.println("(int) 'a'= " + (int) 'a');
        System.out.println("(int) 'z'= " + (int) 'z');
        System.out.println("(int) 'A'= " + (int) 'A');
        System.out.println("(int) 'Z'= " + (int) 'Z');

        //Small
        System.out.println(new BigOrSmall().calculate("AZaz"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}