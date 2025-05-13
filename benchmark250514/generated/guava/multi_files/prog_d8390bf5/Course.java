import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Course {
    private String courseName;
    private Multiset<String> attendance = HashMultiset.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void markAttendance(String studentName) {
        /* write */ attendance.add(studentName);
    }

    public int getAttendanceCount(String studentName) {
        return attendance.count(studentName);
    }
}
