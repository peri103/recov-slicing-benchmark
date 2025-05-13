import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        
        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(data);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = triangularMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for more complex operations
        double[][] data2 = {
            {7, 8, 9},
            {0, 10, 11},
            {0, 0, 12}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(data2);

        // Add the two matrices
        RealMatrix sumMatrix = triangularMatrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = triangularMatrix; // As there's no 'getTriangularMatrix', we directly use the created matrix

        // Print the read matrix to ensure it matches the written matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations to make the program more complex
        RealMatrix multipliedMatrix = triangularMatrix.multiply(anotherMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}