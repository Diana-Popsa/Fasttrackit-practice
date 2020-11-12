package ro.fasttrackit.temaCurs8.anagram_exception;

import java.util.*;

public class Anagram {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        System.out.println("Enter the anagram:");
        String anagram = input.nextLine();

        try {
            isAnagram(word, anagram);
            System.out.printf("%s is an anagram of %s", word, anagram);
        } catch (InvalidAnagramException iae) {
            System.err.println(word + " and " + anagram + " are not anagrams.");
        }


    }

    public static boolean isAnagram(String word, String anagram) throws Exception {
        int word1 = word.length();
        int an = anagram.length();

        if (word1 != an)
            throw new InvalidAnagramException(word + " and " + anagram + " are not anagrams.");

        word = (word.toLowerCase()).trim();
        anagram = (anagram.toLowerCase()).trim();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else return false;
        }
        return anagram.isEmpty();

    }
}
