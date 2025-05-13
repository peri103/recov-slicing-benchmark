import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize diagonal values for the matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 0.5, 0.25});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform additional matrix operations
        RealMatrix matrix2 = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(matrix2);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Extract and print the diagonal values from the matrix
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix() returns the first row as diagonal
        System.out.println("Retrieved Diagonal:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Perform scaling operation on the matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        
        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}