import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Initialize another matrix for additional operations
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Fill the additional matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                additionalMatrix.setEntry(i, j, i + j);
            }
        }
        
        // Perform matrix addition and store the result in a new matrix
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        
        // Write a value to the original matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.5);
        
        // Perform some operations on the result matrix
        double sum = 0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        
        // Print the sum of all entries in the result matrix
        System.out.println("Sum of result matrix: " + sum);
        
        // Read the value from the original matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify the read operation
        System.out.println("Value at (0,0): " + value);
        
        // Perform a scalar multiplication on the additional matrix
        RealMatrix scaledMatrix = additionalMatrix.scalarMultiply(2.0);
        
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