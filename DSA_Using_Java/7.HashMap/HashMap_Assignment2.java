import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        Map<String, Integer> mergedMap = new HashMap<String, Integer>();

        // Add all entries from mapOne
        for (Entry<String, Integer> entry : mapOne.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        // Merge from mapTwo with proper conflict resolution
        for (Entry<String, Integer> entry : mapTwo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (mergedMap.containsKey(key)) {
                // Conflict only if values differ
                if (!mergedMap.get(key).equals(value)) {
                    mergedMap.put(key + "New", value); // Use KeyNew format
                }
                // If values are same, do nothing
            } else {
                mergedMap.put(key, value);
            }
        }

        return mergedMap;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Kelly", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);
        mapTwo.put("Ryan", 25);  // Different value, should trigger "RyanNew"

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
