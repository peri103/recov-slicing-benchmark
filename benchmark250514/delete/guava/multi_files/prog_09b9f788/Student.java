import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private RangeData rangeData = new RangeData();
    private Map<String, Integer> scores = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        scores.put(subject, score);
    }

    public int getScore(String subject) {
        return scores.getOrDefault(subject, 0);
    }

    public void addRangeData(Range<Integer> range, String value) {
        rangeData.addRangeData(range, value);
    }

    public String getRangeData(int key) {
        return rangeData.getRangeData(key);
    }
}