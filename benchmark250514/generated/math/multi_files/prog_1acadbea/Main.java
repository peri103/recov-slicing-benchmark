import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 3);
        student.setScore(0, 85.0);
        student.setScore(1, 90.0);
        student.setScore(2, 95.0);

        RealMatrix scoresMatrix = student.getScoresMatrix();
        System.out.println("Student Scores Matrix:");
        for (int row = 0; row < scoresMatrix.getRowDimension(); row++) {
            for (int col = 0; col < scoresMatrix.getColumnDimension(); col++) {
                System.out.print(scoresMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setMatrixEntry(0, 0, 5.0);
        matrixOps.setMatrixEntry(1, 1, 10.0);
        matrixOps.setMatrixEntry(2, 2, 15.0);

        RealVector vector = new ArrayRealVector(new double[]{2.0, 3.0, 4.0});
        RealVector resultVector = matrixOps.multiplyWithVector(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        double value = matrixOps.getMatrixEntry(0, 0);
        System.out.println("Read value: " + value);
    }
}