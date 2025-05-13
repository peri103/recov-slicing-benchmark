import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize a square matrix with example data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {0.0, 4.0, 5.0},
            {0.0, 0.0, 6.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated operations on another matrix
        double[][] otherData = {
            {7.0, 8.0, 9.0},
            {0.0, 10.0, 11.0},
            {0.0, 0.0, 12.0}
        };
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(otherData);

        // Multiply the other matrix by a scalar
        otherMatrix = otherMatrix.scalarMultiply(2.0);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = otherMatrix.operate(vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Add a visitor to modify the original triangular matrix
        triangularMatrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            @Override
            public double visit(int row, int column, double value) {
                return value * 1.5;
            }

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            @Override
            public double end() {
                return 0;
            }
        });

        // Retrieve the triangular matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved Triangular Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}