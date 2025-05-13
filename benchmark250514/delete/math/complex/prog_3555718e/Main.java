import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(data);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Vector element " + i + ": " + resultVector.getEntry(i));
        }

        // Modify the matrix using a visitor
        matrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}
            public double visit(int row, int column, double value) {
                return value + 1.0; // Increment each element by 1
            }
            public double end() {
                return 0;
            }
        });

        // Perform another operation with the matrix
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Product matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Extract and print the diagonal of the original matrix
        /* read */ double[] diagonal = matrix.getColumn(0);
        
        System.out.println("Diagonal elements:");
        for (double value : diagonal) {
            System.out.println(value);
        }
    }
}