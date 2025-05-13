import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create a vector to perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        
        // Calculate the sum of the elements in the resulting vector
        double sum = 0.0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        
        // Print the sum of the elements in the resulting vector
        System.out.println("Sum of elements in result vector: " + sum);
        
        // Additional matrix operation
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        
        // Display the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve and print the diagonal values from the original matrix
        /* read */ double[] readDiagonalValues = matrix.getData()[0];
        
        System.out.println("Diagonal values from the original matrix:");
        for (double value : readDiagonalValues) {
            System.out.print(value + " ");
        }
    }
}