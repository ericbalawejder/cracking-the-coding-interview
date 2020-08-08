package chapter1;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/*
1.3
Design an algorithm and write code to remove the duplicate characters
in a string without using any additional buffer.
NOTE: One or two additional variables are fine An extra copy of the array is not
Write the test cases for this method
*/

public class RemoveDuplicateCharactersInAString {

    public static void main(String[] args) {
        var removeDuplicateCharactersInAString =
                new RemoveDuplicateCharactersInAString();
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates("abcdefgh"));
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates("aaaaaaaa"));
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates("abababab"));
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates("aaaabbbb"));
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates(null));
        System.out.println(removeDuplicateCharactersInAString.removeDuplicates(""));
    }

    Optional<String> removeDuplicates(String string) {
        if (string == null || string.length() < 2) {
            return Optional.empty();
        }
        Set<Character> characters = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (!characters.contains(c)) {
                characters.add(c);
                stringBuilder.append(c);
            }
        }
        return Optional.of(stringBuilder.toString());
    }
}
