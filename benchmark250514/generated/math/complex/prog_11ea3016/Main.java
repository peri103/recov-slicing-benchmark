import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.5);
        
        // Initialize another matrix with dimensions 3x3
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Set multiple entries in the other matrix
        anotherMatrix.setEntry(0, 0, 1.1);
        anotherMatrix.setEntry(1, 1, 2.2);
        anotherMatrix.setEntry(2, 2, 3.3);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        
        // Print the resulting matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated operations
        double[] vector = {1.0, 2.0, 3.0};
        RealMatrix vectorMatrix = MatrixUtils.createRowRealMatrix(vector);
        RealMatrix multipliedMatrix = resultMatrix.multiply(vectorMatrix.transpose());
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value from the original matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value
        System.out.println("Original Matrix Value at (0, 0): " + value);
    }
}