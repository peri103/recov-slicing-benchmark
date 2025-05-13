import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix of size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);
        
        // Set an entry in the matrix
        /* write */ matrix.setEntry(0, 1, 5.0);
        
        // Initialize another matrix using MatrixUtils for additional operations
        RealMatrix realMatrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Fill the matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                realMatrix.setEntry(i, j, i + j);
            }
        }
        
        // Perform some matrix operations
        RealMatrix transposedMatrix = realMatrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the entry from the symmetric matrix
        /* read */ double value = matrix.getEntry(0, 1);
        
        // Print the value to verify it was set correctly
        System.out.println("Symmetric Matrix Entry (0,1): " + value);
        
        // Perform some additional operations on the symmetric matrix
        matrix.setEntry(1, 2, 10.0);
        double anotherValue = matrix.getEntry(1, 2);
        
        // Print the additional value
        System.out.println("Symmetric Matrix Entry (1,2): " + anotherValue);
        
        // Calculate and print the sum of all entries in the symmetric matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = i; j < matrix.getColumnDimension(); j++) { // Only iterate over upper triangle
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of Symmetric Matrix Entries: " + sum);
    }
}