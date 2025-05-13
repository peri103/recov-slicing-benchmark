import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a student with grades
        Student student = new Student("John Doe", new double[]{85.5, 90.0, 78.5});
        double[] studentGrades = student.getGrades();

        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(studentGrades);

        // Create another matrix and perform operations
        double[] additionalData = {88.0, 92.5, 81.0};
        RealMatrix additionalMatrix = MatrixUtils.createRowRealMatrix(additionalData);

        RealMatrix summedMatrix = matrixOps.addMatrices(additionalMatrix);
        System.out.println("Summed Matrix:");
        for (int i = 0; i < summedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < summedMatrix.getColumnDimension(); j++) {
                System.out.print(summedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrixOps.getMatrix(), 0);

        System.out.println("Matrix row:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}