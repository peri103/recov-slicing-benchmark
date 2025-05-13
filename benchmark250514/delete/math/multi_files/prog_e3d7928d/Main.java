public class Main {
    public static void main(String[] args) {
        // Initialize the matrix data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 4.0, 5.0},
            {3.0, 5.0, 6.0}
        };

        // Create a SymmetricMatrixHandler instance
        SymmetricMatrixHandler matrixHandler = new SymmetricMatrixHandler();
        matrixHandler.createSymmetricMatrix(data);

        // Get the symmetric matrix and perform operations
        /* read */ RealMatrix readMatrix = matrixHandler.getSymmetricMatrix();
        MatrixOperations.performOperations(readMatrix);
    }
}