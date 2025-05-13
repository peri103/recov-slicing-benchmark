import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Initialize another matrix for additional operations
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Create a vector and perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 0.0, 1.0});
        RealVector resultVector = matrix2.operate(vector);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the diagonal matrix using the MatrixUtils class
        /* read */ double[] readDiagonal = matrix.getRow(0); // Using getRow to simulate reading the diagonal matrix

        // Print the diagonal values
        System.out.println("Diagonal values:");
        for (double value : readDiagonal) {
            System.out.println(value);
        }
    }
}