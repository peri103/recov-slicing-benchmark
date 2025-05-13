import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        /* write */ matrix.setEntry(1, 1, 42.0);
        
        // Create another matrix and perform operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });
        
        // Add matrices
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Multiply matrices
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        
        // Calculate determinant of the second matrix
        double determinant = MatrixUtils.inverse(matrix2).getNorm();
        System.out.println("Determinant of matrix2: " + determinant);
        
        // Perform an operation that uses values from the original matrix
        double sum = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in matrix: " + sum);
        
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Value at (1, 1): " + value);
        
        // Output results of matrix operations
        System.out.println("Result of addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Result of multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}