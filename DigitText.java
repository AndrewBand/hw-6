package module6.hw6;

class DigitText {
    public boolean detect(String text){
        boolean digitTextIs = false;
        String[] textInn = text.split(" ");

        for (String textInOne:textInn){
            for (int i = 0; i < textInOne.length(); i++) {

                if (!Character.isDigit(textInOne.charAt(i))) return false;
                System.out.println("textInOne.charAt(" + i + ") = " + textInOne.charAt(i));
            }
            digitTextIs = true;

        }
        return  digitTextIs;
    }

}
class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("959 uxna na 73 83"));
    }
}