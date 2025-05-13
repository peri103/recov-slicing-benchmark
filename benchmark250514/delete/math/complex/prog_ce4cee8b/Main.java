import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = /* write */ MatrixUtils.createSparseMatrix(3, 3);

        // Initialize a vector to perform operations with the matrix
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector resultVector = sparseMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Perform additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = sparseMatrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Added Matrix: " + addedMatrix);

        // Retrieve the sparse matrix using MatrixUtils
        RealMatrix retrievedMatrix = /* read */ MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved Sparse Matrix: " + retrievedMatrix);

        // Perform subtraction with another matrix
        RealMatrix subtractedMatrix = identityMatrix.subtract(retrievedMatrix);

        // Print the subtracted matrix
        System.out.println("Subtracted Matrix: " + subtractedMatrix);

        // Perform scalar multiplication
        RealMatrix scaledMatrix = retrievedMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix: " + scaledMatrix);
    }
}