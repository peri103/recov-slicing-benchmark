import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initializing the diagonal array
        double[] diagonal = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);
        
        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Print the result of matrix addition
        System.out.println("Sum of matrices:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the diagonal from the original matrix
        /* read */ double[] retrievedDiagonal = matrix.getDiagonal();
        
        // Print the retrieved diagonal
        System.out.println("Retrieved diagonal:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
        
        // Additional calculations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Create a zero matrix and check dimensions
        RealMatrix zeroMatrix = MatrixUtils.createRealMatrix(3, 3);
        System.out.println("Zero matrix dimensions: " + zeroMatrix.getRowDimension() + "x" + zeroMatrix.getColumnDimension());
    }
}