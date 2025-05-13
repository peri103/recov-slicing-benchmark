import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using the write method
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Perform some operations on the matrix
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = sparseMatrix.operate(vector);
        
        // Print the result of vector operations
        System.out.println("Result of matrix-vector operation: " + resultVector);
        
        // Perform additional matrix operations
        RealMatrix transposedMatrix = sparseMatrix.transpose();
        double determinant = transposedMatrix.getDeterminant();
        
        // Print the determinant of the transposed matrix
        System.out.println("Determinant of transposed matrix: " + determinant);
        
        // Read the sparse matrix using the read method
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the retrieved matrix to verify correctness
        System.out.println("Retrieved sparse matrix: " + retrievedMatrix);
        
        // Additional operations to make the program more complex
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = retrievedMatrix.multiply(identityMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied matrix: " + multipliedMatrix);
    }
}