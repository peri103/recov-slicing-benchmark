public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        int rows = 3;
        int columns = 3;
        double[][] sparseData = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        double[][] denseData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create sparse matrix handler and perform operations
        SparseMatrixHandler sparseMatrixHandler = new SparseMatrixHandler();
        sparseMatrixHandler.createSparseMatrix(rows, columns, sparseData);

        MatrixOperations matrixOperations = new MatrixOperations(sparseMatrixHandler, denseData);
        RealMatrix resultMatrix = matrixOperations.performMatrixAddition();
        RealVector resultVector = matrixOperations.performVectorOperation();

        // Access the sparse matrix
        /* read */ RealMatrix readMatrix = sparseMatrixHandler.getSparseMatrix();

        // Print the matrices and vectors to verify
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        System.out.println("Read Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}