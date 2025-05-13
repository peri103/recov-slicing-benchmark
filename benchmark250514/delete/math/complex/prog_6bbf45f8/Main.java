import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Perform additional matrix operations
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(data);
        
        // Multiply the diagonal matrix with another matrix
        RealMatrix resultMatrix = matrix.multiply(additionalMatrix);
        
        // Print the result of the multiplication
        System.out.println("Result of multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated arithmetic operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read the diagonal from the original matrix
        /* read */ double[] readDiagonal = matrix.getDiagonal();
        
        // Print the diagonal values
        System.out.println("Diagonal values:");
        for (double value : readDiagonal) {
            System.out.println(value);
        }
        
        // Perform some more operations with the diagonal values
        double sumOfDiagonals = 0;
        for (double value : readDiagonal) {
            sumOfDiagonals += value;
        }
        System.out.println("Sum of diagonal values: " + sumOfDiagonals);
    }
}