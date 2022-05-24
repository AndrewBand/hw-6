package module6.hw6;

class DoubleSpaceCleaner {

    public String clean(String phrase){
        while(phrase.contains("  ")) {
            String replace = phrase.replace("  ", " ");
            phrase=replace;
        }
return phrase.strip();
    }

}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}