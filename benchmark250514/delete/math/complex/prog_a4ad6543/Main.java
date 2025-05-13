import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated matrix operations
        double[][] matrixData = {
            {2.0, 3.0, 1.0},
            {5.0, 6.0, 2.0},
            {8.0, 9.0, 3.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);

        // Print the result of matrix operation
        System.out.println("Result of matrix-vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the triangular matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved triangular matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional unrelated code to make the program more complex
        double[][] anotherMatrixData = {
            {7.0, 8.0, 9.0},
            {4.0, 5.0, 6.0},
            {1.0, 2.0, 3.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(anotherMatrixData);
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);

        // Print the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}