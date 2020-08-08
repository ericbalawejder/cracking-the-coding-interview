package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateCharactersInAStringTest {

    RemoveDuplicateCharactersInAString stringSequence;

    @BeforeEach
    void setUp() {
        stringSequence = new RemoveDuplicateCharactersInAString();
    }

    @Test
    void removeDuplicatesContainsNoDuplicates() {
        Optional<String> expected = Optional.of("abcd");
        Optional<String> actual = stringSequence.removeDuplicates("abcd");
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesContainsAllDuplicates() {
        Optional<String> expected = Optional.of("a");
        Optional<String> actual = stringSequence.removeDuplicates("aaaa");
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesArgumentIsNull() {
        Optional<String> expected = Optional.empty();
        Optional<String> actual = stringSequence.removeDuplicates(null);
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesArgumentIsEmpty() {
        Optional<String> expected = Optional.empty();
        Optional<String> actual = stringSequence.removeDuplicates("");
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesContainsContinuousDuplicates() {
        Optional<String> expected = Optional.of("ab");
        Optional<String> actual = stringSequence.removeDuplicates("aaabbb");
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicatesContainsNonContiguousDuplicates() {
        Optional<String> expected = Optional.of("ab");
        Optional<String> actual = stringSequence.removeDuplicates("abababa");
        assertEquals(expected, actual);
    }
}