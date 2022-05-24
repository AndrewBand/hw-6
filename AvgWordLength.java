package module6.hw6;

class AvgWordLength {
    public double count(String phrase){
        int phraseLehgth = phrase.split(" ").length;
        String[] phraseInArr = phrase.split(" ");
        double countSimbols = 0;
        for (String phraseInArrCell:phraseInArr) {
            countSimbols = countSimbols + phraseInArrCell.length();
        }

        return countSimbols/phraseLehgth;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}