import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Perform some unrelated operations with vectors
        RealVector vector1 = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        RealVector vector2 = new ArrayRealVector(new double[] {7.0, 8.0, 9.0});
        
        // Add vectors
        RealVector vectorSum = vector1.add(vector2);
        System.out.println("Vector Sum: " + vectorSum);

        // Multiply matrix with vector
        RealVector matrixVectorProduct = matrix.operate(vector1);
        System.out.println("Matrix-Vector Product: " + matrixVectorProduct);

        // Perform operations with another matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);
        System.out.println("Result Matrix: " + resultMatrix);

        // Retrieve the diagonal matrix using a method (assuming getDiagonalMatrix is a hypothetical method)
        // Since there is no actual getDiagonalMatrix method in MatrixUtils, we will directly use the matrix created
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // For demonstration, we get the first row

        // Print the diagonal values
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Further operations with matrices
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Subtract matrices
        RealMatrix subtractedMatrix = identityMatrix.subtract(matrix);
        System.out.println("Subtracted Matrix: " + subtractedMatrix);
    }
}