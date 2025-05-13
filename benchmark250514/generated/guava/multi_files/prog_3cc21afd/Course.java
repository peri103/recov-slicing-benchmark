import com.google.common.collect.HashMultiset;

public class Course {
    private String courseName;
    private HashMultiset<String> studentMultiset = HashMultiset.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        studentMultiset.add(studentName);
    }

    public int getStudentCount(String studentName) {
        return studentMultiset.count(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
