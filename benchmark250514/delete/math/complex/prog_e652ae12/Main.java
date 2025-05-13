import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Define a sample 2D array to create a triangular matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {0.0, 4.0, 5.0},
            {0.0, 0.0, 6.0}
        };

        // Use the MatrixUtils class to create a triangular matrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Create a vector for matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = triangularMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Modify matrix using a visitor
        triangularMatrix.walkInRowOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization before visiting entries
            }

            @Override
            public double visit(int row, int column, double value) {
                // Modify each entry by adding 1
                return value + 1;
            }

            @Override
            public double end() {
                // Finalization after visiting entries
                return 0;
            }
        });

        // Use the MatrixUtils class to get the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Further operations on the matrix
        double determinant = retrievedMatrix.getDeterminant();
        System.out.println("Determinant of the retrieved matrix: " + determinant);
    }
}