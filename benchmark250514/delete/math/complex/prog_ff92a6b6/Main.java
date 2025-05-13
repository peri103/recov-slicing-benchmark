import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);
        
        // Write a value into the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Create another matrix for additional operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0}
        });
        
        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        
        // Calculate the determinant of the new matrix
        double determinant = MatrixUtils.inverse(multipliedMatrix).getDeterminant();
        System.out.println("Determinant of the multiplied matrix: " + determinant);
        
        // Modify another entry in the original matrix
        matrix.setEntry(1, 1, 3.0);
        
        // Print the entire matrix to verify changes
        System.out.println("Original matrix after modification:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify the read operation
        System.out.println("Read value from matrix at (0, 0): " + value);
        
        // Perform additional operations with another matrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed another matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}