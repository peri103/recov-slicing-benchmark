import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal array
        double[] diagonal = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(identityMatrix);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = sumMatrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Perform some additional matrix operations
        RealMatrix scalarMatrix = matrix.scalarMultiply(2.0);
        RealMatrix transposedMatrix = scalarMatrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Extract the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a valid method)
        /* read */ double[] extractedDiagonal = matrix.getColumn(0);

        // Print the extracted diagonal to verify
        System.out.println("Extracted diagonal:");
        for (double value : extractedDiagonal) {
            System.out.println(value);
        }
    }
}