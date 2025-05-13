import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Additional operations on matrices
        double[][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data);
        
        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(matrix2);
        
        // Create a vector
        RealVector vector = new ArrayRealVector(new double[] {1, 0, 1});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Retrieve the diagonal from the original matrix
        /* read */ double[] readDiagonalValues = matrix.getColumn(0); // Assuming getDiagonalMatrix method gets the first diagonal
        
        // Print the diagonal values
        System.out.println("Diagonal values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
        
        // Additional matrix operations
        RealMatrix matrix3 = matrix2.transpose();
        RealMatrix sumMatrix = matrix2.add(matrix3);
        
        // Print the sum of matrix and its transpose
        System.out.println("Sum of matrix2 and its transpose:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}