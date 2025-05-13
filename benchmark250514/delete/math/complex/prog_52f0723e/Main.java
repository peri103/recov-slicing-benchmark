import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix for demonstration purposes
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Write: Create a column vector and set it to the first column of the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10, 11, 12});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional code to manipulate the matrix
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            public double visit(int row, int column, double value) {
                return value * 2; // Double each value in the matrix
            }

            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization before visiting
            }

            public double end() {
                return 0; // Return a value after visiting
            }
        };

        matrix.walkInRowOrder(visitor);

        // Create another vector and set it to another column
        RealVector anotherColumnVector = MatrixUtils.createColumnRealVector(new double[]{13, 14, 15});
        matrix.setColumnVector(1, anotherColumnVector);

        // Perform some calculations
        double[] rowSum = new double[matrix.getRowDimension()];
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            rowSum[i] = matrix.getRowVector(i).getL1Norm();
        }

        // Read: Get the column vector from the first column of the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }

        // Print the row sums
        for (double sum : rowSum) {
            System.out.println("Row sum: " + sum);
        }
    }
}