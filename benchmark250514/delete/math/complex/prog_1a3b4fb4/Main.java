import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with a size of 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        
        // Write a value to the matrix
        /* write */ matrix.setEntry(0, 1.5);
        
        // Initialize another matrix for complex operations
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {2.0, 0.0, 0.0},
            {0.0, 3.0, 0.0},
            {0.0, 0.0, 4.0}
        });
        
        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(otherMatrix);
        
        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(otherMatrix);
        
        // Read the value from the original matrix
        /* read */ double value = matrix.getEntry(0);
        
        // Print the read value
        System.out.println("Read value from DiagonalMatrix: " + value);
        
        // Print results of complex operations
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}