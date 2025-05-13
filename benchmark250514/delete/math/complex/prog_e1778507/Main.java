import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix with dimensions 3x3 and fill with zeros.
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = sparseMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });
        RealMatrix addedMatrix = sparseMatrix.add(anotherMatrix);
        System.out.println("Result of matrix addition: " + addedMatrix);

        // Perform some unrelated mathematical operations
        double[] data = {1.0, 2.0, 3.0, 4.0};
        RealVector dataVector = new ArrayRealVector(data);
        RealVector scaledVector = dataVector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);

        // Read the sparse matrix created
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the sparse matrix to verify
        System.out.println("Sparse matrix: " + readMatrix);

        // Perform more operations on the read matrix
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed matrix: " + transposedMatrix);

        // Create a new vector and perform subtraction
        RealVector subtractionVector = new ArrayRealVector(new double[] {5, 6, 7});
        RealVector subtractedResult = subtractionVector.subtract(vector);
        System.out.println("Result of vector subtraction: " + subtractedResult);
    }
}