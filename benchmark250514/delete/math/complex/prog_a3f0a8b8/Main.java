import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse matrix with dimensions and values
        int numRows = 3;
        int numCols = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };

        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Creating another matrix for operations
        double[][] otherData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(otherData);

        // Perform matrix addition
        RealMatrix resultMatrix = sparseMatrix.add(otherMatrix);

        // Create a vector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Additional complex operations
        double[][] transposedData = new double[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedData[j][i] = data[i][j];
            }
        }
        RealMatrix transposedMatrix = MatrixUtils.createRealMatrix(transposedData);

        // Perform matrix subtraction
        RealMatrix subtractedMatrix = transposedMatrix.subtract(resultMatrix);

        // Print the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Assuming getSparseMatrix is a method that retrieves the matrix
        // Here, we simulate the retrieval by directly using the sparseMatrix reference
        /* read */ RealMatrix retrievedMatrix = sparseMatrix;

        // Print the matrix to verify
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}