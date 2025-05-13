import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using MatrixUtils
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = diagonalMatrix.add(identityMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = addedMatrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a hypothetical method)
        // Since MatrixUtils does not have a method named getDiagonalMatrix, we will use getData() to retrieve the matrix data
        /* read */ double[][] matrixData = diagonalMatrix.getData();
        
        // Print the diagonal matrix
        System.out.println("Diagonal Matrix:");
        for (double[] row : matrixData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Perform more operations on the matrix
        RealMatrix multipliedMatrix = diagonalMatrix.multiply(identityMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        double[][] multipliedMatrixData = multipliedMatrix.getData();
        for (double[] row : multipliedMatrixData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}