package at.fhtw.bic.wordcounter.Controller;

import at.fhtw.bic.wordcounter.Controller.WordCounterController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WordCounterControllerTest {

    @Autowired
    private WordCounterController controller;

    @Test
    void testCountWords() {
        String input = "Hello world!";
        int expected = 2;
        int actual = controller.countWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCountLetters() {
        String input = "Hello world!";
        int expected = 10;
        int actual = controller.countLetters(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCountCharacters() {
        String input = "Hello world!";
        int expected = 12;
        int actual = controller.countCharacters(input);
        assertEquals(expected, actual);
    }
}
