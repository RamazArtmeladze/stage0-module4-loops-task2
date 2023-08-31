package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phraseBuilder = new StringBuilder();
        for (char c : chars) {
            phraseBuilder.append(c);
        }
        String phrase = phraseBuilder.toString();
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd');
    }
}

