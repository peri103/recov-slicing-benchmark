import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{1.0, 2.0, 3.0});

        // Create a matrix for demonstration purposes
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Set the first column of the matrix to the created column real vector
        matrix.setColumnVector(0, columnVector);

        // Create another matrix and perform some operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {10.0, 20.0, 30.0},
            {40.0, 50.0, 60.0},
            {70.0, 80.0, 90.0}
        });

        // Add the two matrices
        RealMatrix resultMatrix = matrix.add(anotherMatrix);

        // Apply a visitor to modify the result matrix
        resultMatrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            @Override
            public double visit(int row, int column, double value) {
                return value * 2; // Multiply each element by 2
            }

            @Override
            public double end() {
                return 0;
            }
        });

        // Print the modified result matrix
        System.out.println("Modified Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the first column real vector from the matrix using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the read column vector to verify the result
        System.out.println("Read Column Vector: " + readColumnVector);
    }
}