package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private Anagram word;

    @BeforeEach
    void setUp() {
        word = new Anagram();
    }

    @Test
    void isAnagramEmptyString() {
        assertTrue(word.isAnagram("", ""));
    }

    @Test
    void isAnagram() {
        assertTrue(word.isAnagram("race", "acer"));
    }

    @Test
    void isNotAnagram() {
        assertFalse(word.isAnagram("racecar", "carsrace"));
    }

    @Test
    void isAnagramWithNumbers() {
        assertTrue(word.isAnagram("aaaa09", "aa09aa"));
    }
}