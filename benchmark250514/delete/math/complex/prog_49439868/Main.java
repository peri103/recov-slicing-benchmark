import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the diagonal matrix
        double[] diagonalData = {1.0, 2.0, 3.0};

        // Create the diagonal matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalData);

        // Initialize a vector for matrix operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 0.0, 1.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Modify the matrix using a visitor
        matrix.walkInRowOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // No initialization needed
            }

            public double visit(int row, int column, double value) {
                return value + 1.0; // Increment each element by 1
            }

            public double end() {
                return 0; // No final computation needed
            }
        });

        // Read the diagonal matrix using the read method
        /* read */ double[] readDiagonal = matrix.getColumn(0);

        // Print the modified matrix diagonal to verify correctness
        System.out.println("Modified matrix diagonal:");
        for (double value : readDiagonal) {
            System.out.println(value);
        }

        // Additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(identityMatrix);

        // Print the sum of the original matrix and identity matrix
        System.out.println("Sum of matrix and identity matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}