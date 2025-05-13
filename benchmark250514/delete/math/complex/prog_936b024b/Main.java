import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Modify the matrix using a visitor
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
            }

            @Override
            public double visit(int row, int column, double value) {
                return value + 1.0; // Increment each element by 1
            }

            @Override
            public double end() {
                return 0;
            }
        });

        // Perform additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);

        // Print the added matrix
        System.out.println("Matrix after addition with identity matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        // Print the diagonal entries of the read matrix
        System.out.println("Diagonal entries of the read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, i));
        }
    }
}