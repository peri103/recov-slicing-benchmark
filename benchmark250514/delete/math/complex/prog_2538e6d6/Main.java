import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        RealMatrix identityMatrix;
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Some complex operations on matrices
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

        // Perform matrix addition
        RealMatrix matrixC = matrixA.add(matrixB);

        // Perform matrix multiplication
        RealMatrix matrixD = matrixA.multiply(matrixB);

        // Display results of matrix operations
        System.out.println("Matrix A + Matrix B:");
        printMatrix(matrixC);
        
        System.out.println("Matrix A * Matrix B:");
        printMatrix(matrixD);

        // Additional complex operations
        double determinantA = matrixA.getDeterminant();
        System.out.println("Determinant of Matrix A: " + determinantA);

        // Read the identity matrix using MatrixUtils (assuming getIdentityMatrix is a method to retrieve it)
        RealMatrix retrievedMatrix;
        /* read */ retrievedMatrix = identityMatrix; // Here we assume the identity matrix is returned directly

        // Print the retrieved matrix
        System.out.println("Identity Matrix:");
        printMatrix(retrievedMatrix);
    }

    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}