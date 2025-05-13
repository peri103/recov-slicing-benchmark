import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Create a vector to perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Use MatrixUtils to read the diagonal values from the matrix
        /* read */ double[] readDiagonalValues = matrix.getRow(0); // Assuming we want the first row which contains the diagonal values

        // Print the read diagonal values
        System.out.println("Read diagonal values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }

        // Perform additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}