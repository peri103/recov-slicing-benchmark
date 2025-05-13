import com.google.common.collect.TreeBasedTable;

public class Course {
    private String courseName;
    private TreeBasedTable<Integer, Integer, String> studentGrades = TreeBasedTable.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentGrade(int studentId, int examId, String grade) {
        /* write */ studentGrades.put(studentId, examId, grade);
    }

    public String getStudentGrade(int studentId, int examId) {
        return studentGrades.get(studentId, examId);
    }

    public String getCourseName() {
        return courseName;
    }
}
