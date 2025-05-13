import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {0.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 0.0}
        };
        int rows = 3;
        int columns = 3;

        // Use SparseMatrixHandler to create and get sparse matrix
        SparseMatrixHandler sparseMatrixHandler = new SparseMatrixHandler();
        sparseMatrixHandler.createSparseMatrix(data, rows, columns);

        // Use MatrixOperations for additional operations
        MatrixOperations matrixOperations = new MatrixOperations(rows, columns);
        matrixOperations.modifyComplexMatrix();
        matrixOperations.printMultipliedMatrix();

        // Get the sparse matrix
        /* read */ RealMatrix readMatrix = sparseMatrixHandler.getSparseMatrix();

        // Perform and print transposed matrix
        matrixOperations.printTransposedMatrix(readMatrix);
    }
}