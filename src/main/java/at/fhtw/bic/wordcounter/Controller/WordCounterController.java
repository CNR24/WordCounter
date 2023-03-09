package at.fhtw.bic.wordcounter.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCounterController {
        @GetMapping("/api/words")
        public int countWords(@RequestParam String text) {
            String[] words = text.split("\\s+");
            return words.length;
        }

        @GetMapping("/api/letters")
        public int countLetters(@RequestParam String text) {
            return text.replaceAll("\\s+", "").length();
        }

        @GetMapping("/api/characters")
        public int countCharacters(@RequestParam String text) {
            return text.length();
        }
}

