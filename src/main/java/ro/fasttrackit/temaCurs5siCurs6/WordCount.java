package ro.fasttrackit.temaCurs5siCurs6;

public class WordCount {

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println("REGEX Number of words: " + text.split("\\s+").length); // 1.regex
        System.out.println(" Number of words in the string: " + countWords(text));      // 2. countWords method
    }

    public static int countWords(String text) {
        int wordCount = 1; // assuming at least one word will be in the string
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' &&
                    i < text.length() - 1 && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        return wordCount;

    }

}

