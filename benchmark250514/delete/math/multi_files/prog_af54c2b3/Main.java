public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        
        matrixOps.initializeMatrix();
        
        // Set a specific value in the matrix
        matrixOps.setSpecificValue(0, 0, 42.0);
        
        // Perform some operations
        double sum = 0;
        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                sum += transposedMatrix.getEntry(i, j);
            }
        }

        double trace = 0;
        RealMatrix scaledMatrix = matrixOps.scaleMatrix(2.0);
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            trace += scaledMatrix.getEntry(i, i);
        }
        
        // Read the value from the matrix
        /* read */ double value = matrixOps.getMatrixEntry(0, 0);
        
        // Output the results
        System.out.println("Value at (0, 0): " + value);
        System.out.println("Sum of transposed matrix: " + sum);
        System.out.println("Trace of scaled matrix: " + trace);
    }
}