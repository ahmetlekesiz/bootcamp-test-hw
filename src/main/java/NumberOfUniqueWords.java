import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfUniqueWords {

    public int getNumberOfUniqueWords(String input) {
        input = input.replaceAll("[^a-zA-Z0-9']", " ");
        // Create HashMap By Using Only Unique Words
        // Reference: https://www.tutorialspoint.com/java-program-to-print-all-unique-words-of-a-string
        String[] strArray = input.split("\\s+");
        Map<String, String> hMap = new LinkedHashMap<String, String>();
        for (String s : strArray) {
            if (!hMap.containsKey(s)) {
                hMap.put(s, "Unique");
            }
        }
        return hMap.size();
    }
}
