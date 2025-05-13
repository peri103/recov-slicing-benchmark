import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create diagonal matrix
        MatrixOperations matrixOps = new MatrixOperations();
        double[] diagonalValues = {1.0, 2.0, 3.0};
        matrixOps.createDiagonalMatrix(diagonalValues);
        
        // Perform vector operations
        VectorOperations vectorOps = new VectorOperations(new double[]{1.0, 2.0, 3.0});
        RealMatrix matrix = matrixOps.getMatrix();
        RealVector resultVector = vectorOps.operate(matrix);
        vectorOps.printVector(resultVector);
        
        // Read diagonal values from the matrix
        /* read */ double[] readDiagonalValues = matrix.getColumn(0);
        
        // Output the diagonal values
        System.out.println("Diagonal Values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}