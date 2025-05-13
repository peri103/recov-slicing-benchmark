public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        AdvancedMatrixOperations advMatrixOps = new AdvancedMatrixOperations();

        // Set a specific entry in the matrix
        matrixOps.setMatrixEntry(0, 0, 42.0);

        // Perform operations with another matrix
        RealMatrix sumMatrix = matrixOps.addMatrices(advMatrixOps.getOtherMatrix());
        RealMatrix productMatrix = matrixOps.multiplyMatrices(advMatrixOps.getOtherMatrix());

        // Print the resulting matrices
        System.out.println("Sum Matrix:");
        advMatrixOps.printMatrix(sumMatrix);

        System.out.println("Product Matrix:");
        advMatrixOps.printMatrix(productMatrix);

        // Read the value from the original matrix
        /* read */ double value = matrixOps.getMatrixEntry(0, 0);
        System.out.println("Read Value: " + value);

        // Perform some operations on the matrix
        double trace = matrixOps.getTrace();
        System.out.println("Trace of the matrix: " + trace);

        RealMatrix transposeMatrix = matrixOps.getTranspose();
        System.out.println("Transpose Matrix:");
        advMatrixOps.printMatrix(transposeMatrix);
    }
}