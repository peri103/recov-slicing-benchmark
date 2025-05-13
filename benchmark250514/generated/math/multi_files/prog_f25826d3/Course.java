import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Course {
    private SparseRealMatrix gradeMatrix;

    public Course(int students, int assignments) {
        gradeMatrix = new OpenMapRealMatrix(students, assignments);
    }

    public void setGrade(int studentIndex, int assignmentIndex, double grade) {
        /* write */ gradeMatrix.setEntry(studentIndex, assignmentIndex, grade);
    }

    public SparseRealMatrix getGradeMatrix() {
        return gradeMatrix;
    }
}
