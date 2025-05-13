import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        // Set some initial values in the matrix
        matrix.setEntry(0, 1, 2.0);
        matrix.setEntry(1, 0, 3.0);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant: " + determinant);
        
        // Set the value at row 0, column 0 to 5.0
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Perform additional matrix operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Use a loop to do some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares: " + sum);

        // Read the value at row 0, column 0
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to ensure it was set and read correctly
        System.out.println("Value at (0, 0): " + value);
        
        // More unrelated calculations
        double product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 numbers: " + product);
    }
}