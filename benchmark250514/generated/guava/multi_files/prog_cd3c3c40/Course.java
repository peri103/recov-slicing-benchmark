import com.google.common.collect.TreeBasedTable;

public class Course {
    private TreeBasedTable<Integer, Integer, String> enrollmentTable = TreeBasedTable.create();

    public void enrollStudent(int courseId, int studentId, String studentName) {
        /* write */ enrollmentTable.put(courseId, studentId, studentName);
    }

    public String getStudentName(int courseId, int studentId) {
        return enrollmentTable.get(courseId, studentId);
    }
}