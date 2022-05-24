package module6.hw6;

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;
        String[] phrInArr = phrase.split(" ");
        for (String phrWord:phrInArr) {
            int simbWord = phrWord.split("").length;
            if( simbWord <= minLength ){
                count++;
            }

        }
return count;
    }
}
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}