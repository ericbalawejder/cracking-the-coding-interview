package chapter1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1.4 Write a method to decide if two strings are anagrams or not.
// O(n) version here:
// https://github.com/ericbalawejder/Exercism.io/blob/master/java/anagram/src/main/java/Anagram.java

public class Anagram {

    boolean isAnagram(String word, String wordToCompare) {
        return sort(word).equals(sort(wordToCompare));
    }

    private String sort(String word) {
        return Stream.of(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
