import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Course {
    private String courseName;
    private MatrixOperations matrixOps;

    public Course(String courseName, double[][] initialData) {
        this.courseName = courseName;
        this.matrixOps = new MatrixOperations(initialData);
    }

    public void updateScores(int row, double[] scores) {
        matrixOps.setRowVector(row, scores);
    }

    public RealVector getScores(int row) {
        return matrixOps.getRowVector(row);
    }

    public void printMatrix() {
        RealMatrix matrix = matrixOps.getMatrix();
        System.out.println("Matrix for course: " + courseName);
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
