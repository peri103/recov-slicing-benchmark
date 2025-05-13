import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixDimensionMismatchException;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse matrix with some values
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length);
        
        // Populate the sparse matrix with the given data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sparseMatrix.setEntry(i, j, data[i][j]);
            }
        }

        // Create a dense matrix for additional operations
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform some operations on the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealMatrix addedMatrix = denseMatrix.add(transposedMatrix);

        // Vector operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = denseMatrix.operate(vector);

        // Print results of vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Error handling for matrix operations
        try {
            RealMatrix invalidOperation = denseMatrix.multiply(sparseMatrix);
        } catch (MatrixDimensionMismatchException e) {
            System.out.println("Matrix dimensions do not match for multiplication.");
        }

        // Retrieve the sparse matrix
        /* read */ RealMatrix retrievedMatrix = sparseMatrix;

        // Print the retrieved matrix to verify the values
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operations on the dense matrix
        RealMatrix scaledMatrix = denseMatrix.scalarMultiply(2);
        System.out.println("Scaled Dense Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}