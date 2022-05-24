package module6.hw6;

class MathDetector {
    public boolean isMath(String text) {
        boolean isEqual = false;
        boolean isMathSign = false;
        boolean isTwoDigit = false;
        int countDigit = 0;
        for (int i = 0; i < text.length(); i++) {
//            в тексте есть хотя бы один символ =;
//            в тексте есть хотя бы один математический оператор +, -, *, /;
//            в тексте есть минимум 2 цифры

            if(text.charAt(i) == '=') isEqual = true;
            if(     text.charAt(i) == '+' ||
                    text.charAt(i) == '-' ||
                    text.charAt(i) == '*' ||
                    text.charAt(i) == '/'   ) isMathSign = true;
            if(!Character.isDigit(text.charAt(i))) {
                countDigit++;
                if(countDigit < 1) isTwoDigit = true;
            }
        }
        return isEqual || isMathSign || isTwoDigit;
    }
}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 +=is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}