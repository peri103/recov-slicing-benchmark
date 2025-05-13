import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix with dimensions 3x3
        int rows = 3;
        int columns = 3;
        OpenMapRealMatrix sparseMatrix = new OpenMapRealMatrix(rows, columns);

        // Initialize the matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);

        /* write */ MatrixUtils.createSparseMatrix(sparseMatrix.getData());

        // Additional Matrix Operations
        Array2DRowRealMatrix denseMatrix = new Array2DRowRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform matrix addition
        RealMatrix sumMatrix = denseMatrix.add(sparseMatrix);
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);

        // Create a vector
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});

        // Perform matrix-vector multiplication
        RealVector resultVector = sumMatrix.operate(vector);
        System.out.println("Result Vector:");
        printVector(resultVector);

        // Some unrelated computations
        double result = Math.pow(2, 3) + Math.sqrt(16) - Math.log(1);
        System.out.println("Unrelated computation result: " + result);

        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);

        // Print the sparse matrix
        System.out.println("Sparse Matrix:");
        printMatrix(readMatrix);
    }

    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static void printVector(RealVector vector) {
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();
    }
}