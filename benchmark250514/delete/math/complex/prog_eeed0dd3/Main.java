import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix and a 2x2 matrix
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        Array2DRowRealMatrix matrix2 = new Array2DRowRealMatrix(2, 2);
        
        // Populate the second matrix with some values
        matrix2.setEntry(0, 0, 10.0);
        matrix2.setEntry(0, 1, 20.0);
        matrix2.setEntry(1, 0, 30.0);
        matrix2.setEntry(1, 1, 40.0);
        
        // Perform some operations on the second matrix
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);
        
        // Use the write method to set a value in the first matrix
        /* write */ matrix.setEntry(0, 0, 42.0);
        
        // Populate other entries in the first matrix
        matrix.setEntry(0, 1, 5.0);
        matrix.setEntry(0, 2, 7.0);
        matrix.setEntry(1, 0, 3.0);
        matrix.setEntry(1, 1, 8.0);
        matrix.setEntry(1, 2, 6.0);
        matrix.setEntry(2, 0, 9.0);
        matrix.setEntry(2, 1, 4.0);
        matrix.setEntry(2, 2, 2.0);
        
        // Calculate the sum of all entries in the first matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in matrix: " + sum);
        
        // Use the read method to retrieve the specific value from the first matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the retrieved value
        System.out.println("Retrieved value: " + value);
        
        // Perform matrix addition between matrix and matrix2
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}