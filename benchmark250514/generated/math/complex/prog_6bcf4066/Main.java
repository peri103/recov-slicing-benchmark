import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createRealMatrix(2, 2);
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);

        // Add complexity: Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector resultVector = sparseMatrix.operate(vector);
        System.out.println("Resultant vector after matrix operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Add complexity: Use a visitor to modify matrix entries
        sparseMatrix.walkInRowOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization if needed
            }

            public double visit(int row, int column, double value) {
                return value + 1.0; // Increment each entry by 1
            }

            public double end() {
                return 0; // Finalization if needed
            }
        });

        // Since there is no direct method named getSparseMatrix in MatrixUtils,
        // we will use the matrix we have already created.
        /* read */ RealMatrix readMatrix = sparseMatrix;

        // Output the matrix to verify the read operation
        System.out.println("Modified matrix after visitor operation:");
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Add complexity: Perform matrix multiplication
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix multipliedMatrix = readMatrix.multiply(identityMatrix);
        System.out.println("Matrix after multiplication with identity matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}