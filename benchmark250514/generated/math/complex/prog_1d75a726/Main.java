import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3); // Initialize a 3x3 matrix
        
        // Set some entries in the matrix
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(0, 1, 2.0);
        matrix.setEntry(0, 2, 3.0);
        
        /* write */ matrix.setEntry(1, 1, 5.0); // Set the entry at row 1, column 1 to 5.0
        
        // Perform some matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3); // Create an identity matrix
        RealMatrix resultMatrix = matrix.multiply(identityMatrix); // Multiply with identity matrix
        
        // Print the result of matrix multiplication
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // More operations
        matrix.setEntry(2, 0, 4.0);
        matrix.setEntry(2, 1, 5.0);
        matrix.setEntry(2, 2, 6.0);
        
        // Calculate the transpose of the matrix
        RealMatrix transposeMatrix = matrix.transpose();
        
        // Print the transpose matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ double value = matrix.getEntry(1, 1); // Get the entry at row 1, column 1
        System.out.println("Read Value: " + value);
        
        // Additional operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0); // Scale the matrix by a factor of 2
        
        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}