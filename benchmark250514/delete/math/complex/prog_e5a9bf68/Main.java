import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse matrix with some values
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length);

        // Fill the sparse matrix with data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sparseMatrix.setEntry(i, j, data[i][j]);
            }
        }

        // Create a dense matrix for additional complexity
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(data);

        // Perform matrix addition
        RealMatrix resultMatrix = denseMatrix.add(sparseMatrix);

        // Create a vector and perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the result vector
        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        /* read */
        RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix.getData());

        // Print the retrieved matrix to verify the values
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Further operations for complexity
        RealMatrix transposedMatrix = retrievedMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}