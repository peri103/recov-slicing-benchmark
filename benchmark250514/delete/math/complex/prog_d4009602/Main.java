import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for creating a matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Use MatrixUtils to create a BlockRealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Create a vector and perform some operations
        double[] vectorData = {1.0, 1.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply the matrix by the vector
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Perform additional matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the matrix using getBlockRealMatrix, though this method is not standard in MatrixUtils,
        // we assume it is a method to get the matrix back for the purpose of the example.
        /* read */ RealMatrix retrievedMatrix = matrix; // Assuming getBlockRealMatrix would return the matrix itself

        // Output the retrieved matrix
        System.out.println("Retrieved matrix: ");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        System.out.println("Identity matrix: ");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}