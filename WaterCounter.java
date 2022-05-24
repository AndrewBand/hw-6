package module6.hw6;

import java.util.Arrays;

class WaterCounter {
    public double count(String text) {

        String textFoCountWords = text;
        double countSpase = 0.00000000000000000;

        while (textFoCountWords.contains("  ")) {

            textFoCountWords = textFoCountWords.replace("  ", " ");
        }

        String[] textSimbol = text.split("");

        for (String textSimbolCell:textSimbol) {
            if (textSimbolCell.equals(" ")) {
                countSpase++;
            }
        }
        System.out.println("countSpase = " + countSpase);
        return countSpase/textSimbol.length;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("N "));
    }
}
