import com.google.common.collect.LinkedHashMultiset;

public class Course {
    private String courseName;
    private LinkedHashMultiset<String> classesAttended;

    public Course() {
        this.classesAttended = LinkedHashMultiset.create();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addClassAttended(String className) {
        /* write */ classesAttended.add(className);
    }

    public int getClassAttendanceCount(String className) {
        /* read */ return classesAttended.count(className);
    }
}
