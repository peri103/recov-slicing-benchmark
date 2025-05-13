public class Main {
    public static void main(String[] args) {
        // Initialize SparseMatrixHandler
        SparseMatrixHandler sparseMatrixHandler = new SparseMatrixHandler(3, 3);

        // Perform matrix operations
        RealMatrix resultMatrix = MatrixOperations.createAndMultiplyMatrix();
        System.out.println("Result Matrix after scalar multiplication: ");
        printMatrix(resultMatrix);

        // Perform vector operations
        RealVector resultVector = MatrixOperations.createAndMultiplyVector();
        System.out.println("Result Vector after scalar multiplication: ");
        printVector(resultVector);

        // Get the sparse matrix
        /* read */
        RealMatrix readMatrix = sparseMatrixHandler.getSparseMatrix();

        // Print the sparse matrix
        System.out.println("Sparse Matrix: ");
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