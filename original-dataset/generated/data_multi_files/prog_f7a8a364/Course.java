import java.util.SortedMap;
import java.util.TreeMap;

public class Course {
    private String courseName;
    private SortedMap<Integer, String> topics = new TreeMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addTopic(int week, String topic) {
        /* write */ topics.put(week, topic);
    }

    public String getTopic(int week) {
        /* read */ return topics.get(week);
    }
}
