import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Some unrelated arithmetic operations
        double sum = 0.0;
        for (double value : diagonalValues) {
            sum += value;
        }
        System.out.println("Sum of diagonal values: " + sum);
        
        // Perform matrix multiplication with another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });
        
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the diagonal matrix
        /* read */ RealMatrix diagonalMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        // Print the diagonal matrix
        System.out.println("Diagonal Matrix:");
        for (int i = 0; i < diagonalMatrix.getRowDimension(); i++) {
            System.out.println(diagonalMatrix.getEntry(i, i));
        }
    }
}