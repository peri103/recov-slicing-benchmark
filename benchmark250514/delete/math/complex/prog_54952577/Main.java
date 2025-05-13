import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a dense matrix for additional complexity
        double[][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        RealMatrix denseMatrix = new Array2DRowRealMatrix(data);
        
        // Perform some operations on the dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealMatrix scaledMatrix = denseMatrix.scalarMultiply(2.0);
        
        // Initialize the sparse matrix
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Fill the sparse matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // More operations on the dense matrix
        RealMatrix sumMatrix = denseMatrix.add(transposedMatrix);
        RealMatrix diffMatrix = denseMatrix.subtract(scaledMatrix);
        
        /* write */ MatrixUtils.createSparseMatrix(3, 3);

        // Some calculations with results from dense matrix operations
        double traceSum = sumMatrix.getTrace();
        double traceDiff = diffMatrix.getTrace();
        System.out.println("Trace of sum matrix: " + traceSum);
        System.out.println("Trace of diff matrix: " + traceDiff);

        /* read */ RealMatrix retrievedMatrix = sparseMatrix;

        // Print the retrieved sparse matrix to verify
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Further operations on dense matrix
        RealMatrix multipliedMatrix = denseMatrix.multiply(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}