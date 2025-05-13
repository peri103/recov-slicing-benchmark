import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Creating a dense matrix for additional operations
        RealMatrix denseMatrix = new Array2DRowRealMatrix(data);
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});

        // Performing matrix-vector multiplication
        RealVector resultVector = denseMatrix.operate(vector);

        // Printing the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Adding a scalar to the dense matrix
        denseMatrix.walkInOptimizedOrder((row, column, value) -> value + 1.0);

        // Printing the modified dense matrix
        System.out.println("Modified dense matrix:");
        for (int i = 0; i < denseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < denseMatrix.getColumnDimension(); j++) {
                System.out.print(denseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Printing the retrieved sparse matrix
        System.out.println("Retrieved sparse matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}