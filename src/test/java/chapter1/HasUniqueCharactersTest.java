package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasUniqueCharactersTest {

    HasUniqueCharacters word;

    @BeforeEach
    void setup() {
        word = new HasUniqueCharacters();
    }

    @Test
    void testHasUniqueCharacters() {
        assertTrue(word.hasUniqueCharacters("coding"));
    }

    @Test
    void testDoesNotHaveUniqueCharacters() {
        assertFalse(word.hasUniqueCharacters("google"));
    }

    @Test
    void testHasUniqueCharactersWithNumbers() {
        assertTrue(word.hasUniqueCharacters("123456"));
    }

    @Test
    void testHasUniqueCharactersWithCase() {
        assertTrue(word.hasUniqueCharacters("molLy"));
    }

    @Test
    void testHasUniqueCharactersWithSymbols() {
        assertTrue(word.hasUniqueCharacters("#$^!@)("));
    }
}