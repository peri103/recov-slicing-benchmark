import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = identityMatrix.operate(vector);

        // Modify the matrix using a visitor pattern
        identityMatrix.walkInRowOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // No initialization needed
            }

            @Override
            public double visit(int row, int column, double value) {
                return value * 2; // Multiply each element by 2
            }

            @Override
            public double end() {
                return 0; // No finalization needed
            }
        });

        // Perform additional matrix operations
        RealMatrix scaledMatrix = identityMatrix.scalarMultiply(0.5);
        RealMatrix addedMatrix = identityMatrix.add(scaledMatrix);

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(identityMatrix);

        // Print the original identity matrix to verify the result
        System.out.println("Original Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the modified matrix
        System.out.println("Modified Matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}