import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = identityMatrix.operate(vector); // Multiply vector with identity matrix

        // Perform additional matrix operations
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][]{
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        });

        // Add matrices
        RealMatrix sumMatrix = matrixA.add(matrixB);

        // Subtract matrices
        RealMatrix diffMatrix = matrixA.subtract(matrixB);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated calculations
        int a = 5;
        int b = 10;
        int c = a * b + b / a - a;

        System.out.println("Result of unrelated calculations: " + c);

        // Retrieve the identity matrix created earlier
        /* read */ RealMatrix retrievedMatrix = identityMatrix; // This line simulates the retrieval

        // Print the identity matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of vector operation
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}