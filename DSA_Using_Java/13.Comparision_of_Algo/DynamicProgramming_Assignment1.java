import java.util.ArrayList;
import java.util.List;

class Tester {
    
    static int count = 0;
    
    public static void findWordSegments(List<String> wordsList, String inputString) {
        segmentHelper(wordsList, inputString, 0);
    }

    private static void segmentHelper(List<String> wordsList, String inputString, int startIndex) {
        if (startIndex == inputString.length()) {
            count++;
            return;
        }
        
        for (int i = startIndex + 1; i <= inputString.length(); i++) {
            String sub = inputString.substring(startIndex, i);
            if (wordsList.contains(sub)) {
                segmentHelper(wordsList, inputString, i);
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<String>();
        wordsList.add("i");
        wordsList.add("like");
        wordsList.add("pizza");
        wordsList.add("li");
        wordsList.add("ke");
        wordsList.add("pi");
        wordsList.add("zza");

        String inputString = "ilikepizza";
        findWordSegments(wordsList, inputString);
        System.out.println("Number of segments: " + count);
    }
}
