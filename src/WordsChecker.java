import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    public String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;

        for (String searchWord : text.split("\\P{IsAlphabetic}")) {
            set.add(searchWord);
        }
    }

    public boolean hasWord(String searchWord) {
        return set.contains(searchWord);
    }
}
