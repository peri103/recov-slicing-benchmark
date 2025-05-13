import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 3 rows and 3 columns
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        // Write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 42.0);
        
        // Initialize another matrix with some values
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(data);
        
        // Add the two matrices together
        RealMatrix sumMatrix = matrix.add(otherMatrix);
        
        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(otherMatrix);
        
        // Print the resulting matrices
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
        
        // Read the value from the original matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value read from the matrix
        System.out.println("Read Value: " + value);
        
        // Perform some operations on the matrix
        double trace = matrix.getTrace();
        System.out.println("Trace of the matrix: " + trace);
        
        RealMatrix transposeMatrix = matrix.transpose();
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}