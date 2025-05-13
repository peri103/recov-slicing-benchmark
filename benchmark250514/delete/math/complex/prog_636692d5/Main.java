import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the necessary variables for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a sparse matrix using the specified method
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns, data);

        // Perform some complex operations using RealVector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = sparseMatrix.operate(vector);

        // Output the result of vector operation
        System.out.println("Result of vector operation: " + resultVector);

        // More complex matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = sparseMatrix.add(identityMatrix);

        // Output the added matrix
        System.out.println("Added Matrix: " + addedMatrix);

        // Read the sparse matrix using the specified method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Output the read matrix to verify the value
        System.out.println("Read Matrix: " + readMatrix);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = readMatrix.multiply(identityMatrix);

        // Output the multiplied matrix
        System.out.println("Multiplied Matrix: " + multipliedMatrix);
    }
}