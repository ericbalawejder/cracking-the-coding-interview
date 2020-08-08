package chapter1;

import java.util.Arrays;

// 1.1 Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?

public class HasUniqueCharacters {

    public static void main(String[] args) {
        System.out.println(hasUniqueCharacters("coding"));
        System.out.println(hasUniqueCharacters("interview"));
    }

    static boolean hasUniqueCharacters(String word) {
        final char[] characters = word.toCharArray();
        Arrays.sort(characters);

        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] != characters[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
