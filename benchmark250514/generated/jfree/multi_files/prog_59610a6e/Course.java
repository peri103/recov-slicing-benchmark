import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<IntervalMarkerWrapper> intervals;

    public Course(String courseName) {
        this.courseName = courseName;
        this.intervals = new ArrayList<>();
    }

    public void addInterval(double start, double end) {
        IntervalMarkerWrapper interval = new IntervalMarkerWrapper(start, end);
        intervals.add(interval);
    }

    public List<IntervalMarkerWrapper> getIntervals() {
        return intervals;
    }

    public String getCourseName() {
        return courseName;
    }
}
