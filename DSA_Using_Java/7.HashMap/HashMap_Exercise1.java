import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Student {

    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        Map<String, Double> result = new HashMap<>();

        if (studentMarks == null || studentMarks.isEmpty()) {
            return result;
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double mark : studentMarks.values()) {
            if (mark > max) {
                max = mark;
            }
            if (mark < min) {
                min = mark;
            }
        }

        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == max || entry.getValue() == min) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}

class Tester {

    public static void main(String args[]) {
        Map<String, Double> studentMarks = new HashMap<String, Double>();
        studentMarks.put("Lily", 90.0);
        studentMarks.put("Robin", 64.5);
        studentMarks.put("Marshall", 76.5);
        studentMarks.put("Neil", 67.0);
        studentMarks.put("Ted", 90.5);

        Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);

        System.out.println("Details of Top Scorers & Low Scorers\n====================================");
        for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
