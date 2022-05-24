package module6.hw6;

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String[] sensitiveWorlds = {"pass", "key", "login", "email"};
        boolean sensitiveDataIs = false;

        outLoop:
            for(String sensitiveWorld:sensitiveWorlds){
                if ((phrase.toLowerCase()).contains(sensitiveWorld)){
                    sensitiveDataIs = true;
                    break outLoop;
                } else {
                    sensitiveDataIs = false;
                }
            }
        return  sensitiveDataIs;
    }
}
class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
