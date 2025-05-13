import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{{1, 2}, {3, 4}});
        
        RealMatrixPreservingVisitor visitor = new RealMatrixPreservingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public void visit(int row, int column, double value) {
                /* write */ sum += value; // Executed once per matrix element
            }

            @Override
            public double end() {
                /* read */ return sum; // Executed once
            }
        };

        matrix.walkInRowOrder(visitor);
        double result = visitor.end();
        System.out.println("Sum of matrix elements: " + result);

        // Additional complexity: Vector operations
        RealVector vector = new ArrayRealVector(new double[]{5, 6});
        RealVector resultVector = matrix.operate(vector);

        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Additional complexity: Matrix operations
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{{7, 8}, {9, 10}});
        RealMatrix addedMatrix = matrix.add(matrix2);

        System.out.println("Result of matrix addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}