import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        
        // Use MatrixUtils to create a RealMatrix from the 2D array
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Create a vector and perform operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println("\n");

        // Calculate and print the transpose of the matrix
        RealMatrix transposeMatrix = matrix.transpose();
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Use MatrixUtils to retrieve the 2D array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify
        System.out.println("Retrieved data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}