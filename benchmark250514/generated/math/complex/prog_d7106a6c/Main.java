import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a BlockRealMatrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Write a value at row 1, column 1
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Initialize another matrix and perform some operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        Random random = new Random();
        
        // Fill matrix2 with random values
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            for (int j = 0; j < matrix2.getColumnDimension(); j++) {
                matrix2.setEntry(i, j, random.nextDouble() * 10);
            }
        }
        
        // Add matrix2 to the original matrix
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Perform a scalar multiplication on resultMatrix
        RealMatrix scaledMatrix = resultMatrix.scalarMultiply(2.0);
        
        // Calculate the transpose of the scaledMatrix
        RealMatrix transposedMatrix = scaledMatrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.printf("%.2f ", transposedMatrix.getEntry(i, j));
            }
            System.out.println();
        }

        // Read the original value at row 1, column 1
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the read value
        System.out.println("Original value at (1,1): " + value);
    }
}