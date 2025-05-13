import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Set the value at position (1, 1) to 5.0
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Create another matrix and perform operations
        BlockRealMatrix matrix2 = new BlockRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 2.0);
        matrix2.setEntry(0, 1, 4.0);
        matrix2.setEntry(0, 2, 6.0);
        matrix2.setEntry(1, 0, 8.0);
        matrix2.setEntry(1, 1, 10.0);
        matrix2.setEntry(1, 2, 12.0);
        matrix2.setEntry(2, 0, 14.0);
        matrix2.setEntry(2, 1, 16.0);
        matrix2.setEntry(2, 2, 18.0);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        
        // Print the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println("Read value: " + value);

        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix2.getEntry(i, j);
            }
        }
        System.out.println("Sum of elements in matrix2: " + sum);
    }
}