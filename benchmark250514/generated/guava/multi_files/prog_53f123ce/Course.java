import com.google.common.collect.LinkedListMultimap;

public class Course {
    private String courseName;
    private LinkedListMultimap<String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = LinkedListMultimap.create();
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public LinkedListMultimap<String, Integer> getGrades() {
        return grades;
    }

    public String getCourseName() {
        return courseName;
    }
}
