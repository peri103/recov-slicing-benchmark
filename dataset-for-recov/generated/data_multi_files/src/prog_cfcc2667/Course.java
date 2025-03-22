import java.util.SortedMap;
import java.util.TreeMap;

public class Course {
    private SortedMap<Integer, String> courseContent = new TreeMap<>();

    public void addContent(int week, String content) {
        /* write */ courseContent.put(week, content);
    }

    public String getContent(int week) {
        return courseContent.get(week);
    }
}
