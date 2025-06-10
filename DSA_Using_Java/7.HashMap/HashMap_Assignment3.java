import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                continue; // skip spaces
            }
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String args[]) {
        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
