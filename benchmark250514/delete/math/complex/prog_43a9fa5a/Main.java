import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Additional code to make the program more complex
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector); // Multiply matrix with vector

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Perform matrix addition with another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}});
        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.print(addedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read the diagonal matrix using MatrixUtils (assuming getDiagonalMatrix is a hypothetical method)
        /* read */ double[] readValues = matrix.getColumn(0); // Using getColumn(0) to simulate reading diagonal values

        // Print the read diagonal values
        System.out.println("Read Diagonal Values:");
        for (double value : readValues) {
            System.out.println(value);
        }
    }
}