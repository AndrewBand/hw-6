package module6.hw6;

import java.util.Arrays;

class UniqueCharCounter {
    public int count(String phrase){

        int count = 0;
        String[] uniqueChars = phrase.toLowerCase().split("");
        System.out.println("Arrays.toString(uniqueChars) = " + Arrays.toString(uniqueChars));

        System.out.println("Arrays.toString(phrase.getBytes()) = " + Arrays.toString(phrase.toLowerCase().getBytes()));

//        Byte[] unicInBayte = new Byte[phrase.split("").length];
//        for(int i = 0 ; i > phrase.split("").length ; i++ ){
//            unicInBayte[i] = uniqueChars[i].getBytes()[i];
//        }
//        System.out.println("Arrays.toString(unicInBayte) = " + Arrays.toString(unicInBayte));

        int arrLehgth = phrase.split("").length;
        String[] unicChar = new String[arrLehgth];
        int firstNull = 0;

        for (String unicChar1 : uniqueChars) {
            outLoop:
            for (int i = 0; i < arrLehgth; i++) {

                if(unicChar1.equals(unicChar[i])){
                    break outLoop;
                }
                if (!unicChar1.equals(unicChar[i])) {
                    if (unicChar[i] == null) {
                        unicChar[i] = unicChar1;
                        break outLoop;
                    }
                }
            }
        }
        if(!(unicChar[arrLehgth-1] == (null))){

        } else {
            for (int i = 0; i < arrLehgth; i++) {
                if(unicChar[i] == (null)){
                    firstNull = i;
                    break;
                }
            }
            unicChar = Arrays.copyOf(unicChar, firstNull);
        }



        return unicChar.length;
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
//        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("E34ex F9y0c3 Im2"));

        //3
        System.out.println(charCounter.count("Dy0 N1by Y5"));
    }
}
