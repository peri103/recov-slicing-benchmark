import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 3 rows and 3 columns
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        // Perform some unrelated matrix operations
        RealMatrix matrixB = new Array2DRowRealMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        RealMatrix resultMatrix = matrixB.scalarMultiply(2.0);
        
        // Print the result of multiplication
        System.out.println("Result of scalar multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Write a value into the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Perform some operations with a new matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = identityMatrix.add(matrixB);
        
        // Print the sum of the identity matrix and matrixB
        System.out.println("Sum of identity matrix and matrixB:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println("Value at position (1, 1): " + value);
        
        // More complex operations
        RealMatrix transposedMatrixB = matrixB.transpose();
        System.out.println("Transposed matrixB:");
        for (int i = 0; i < transposedMatrixB.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrixB.getColumnDimension(); j++) {
                System.out.print(transposedMatrixB.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}