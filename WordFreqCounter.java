package module6.hw6;

class WordFreqCounter {

    public float countFreq(String phrase, String word){
        float countPhrase = 0;
        String [] phraseSeparatedInArray = phrase.toLowerCase().split(" ");
        for (String phraseSeparated:phraseSeparatedInArray) {
            if(phraseSeparated.equals(word.toLowerCase())){
                countPhrase++;
            }
        }
        return countPhrase/phrase.split(" ").length;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}