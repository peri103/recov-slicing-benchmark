import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Course {
    private String courseName;
    private RealMatrix gradeMatrix;

    public Course(String courseName) {
        this.courseName = courseName;
        double[][] initialGrades = {
            {85.0, 90.0, 95.0},
            {88.0, 92.0, 96.0}
        };
        this.gradeMatrix = MatrixUtils.createRealMatrix(initialGrades);
    }

    public void updateGrades(double[] newGrades, int row) {
        RealVector rowVector = MatrixUtils.createRowRealVector(newGrades);
        /* write */ gradeMatrix.setRowVector(row, rowVector);
    }

    public RealVector getGrades(int row) {
        /* read */ return gradeMatrix.getRowVector(row);
    }

    public String getCourseName() {
        return courseName;
    }
}
