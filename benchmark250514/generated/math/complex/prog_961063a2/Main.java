import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for matrix creation
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};

        // Create a RealMatrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Perform operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for additional operations
        double[][] data2 = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);

        // Add the two matrices together
        RealMatrix sumMatrix = matrix.add(matrix2);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Retrieve the array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved data to verify correctness
        System.out.println("Original Matrix:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}