import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with a size of 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);
        
        // Set an entry in the symmetric matrix
        /* write */ matrix.setEntry(0, 1, 5.0);
        
        // Initialize a regular matrix and perform operations
        RealMatrix regularMatrix = new Array2DRowRealMatrix(3, 3);
        regularMatrix.setEntry(0, 0, 1.0);
        regularMatrix.setEntry(1, 1, 2.0);
        regularMatrix.setEntry(2, 2, 3.0);

        // Perform a matrix multiplication
        RealMatrix resultMatrix = regularMatrix.multiply(regularMatrix);

        // Print the result of the multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some operations on the symmetric matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in the symmetric matrix: " + sum);

        // Read the entry from the symmetric matrix
        /* read */ double value = matrix.getEntry(0, 1);
        
        // Print the value to ensure it was read correctly
        System.out.println("Read value from symmetric matrix: " + value);

        // Additional operations on regular matrix
        double regularMatrixSum = 0.0;
        for (int i = 0; i < regularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < regularMatrix.getColumnDimension(); j++) {
                regularMatrixSum += regularMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in the regular matrix: " + regularMatrixSum);
    }
}