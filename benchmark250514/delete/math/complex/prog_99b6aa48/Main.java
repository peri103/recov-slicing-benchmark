import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(data);
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        
        // Additional complex operations
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            public double visit(int row, int column, double value) {
                return value * 2; // Double each element
            }

            public double end() {
                return 0;
            }
        };
        
        matrix.walkInRowOrder(visitor);

        RealMatrixPreservingVisitor preservingVisitor = new RealMatrixPreservingVisitor() {
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            public void visit(int row, int column, double value) {
                System.out.println("Matrix element [" + row + "][" + column + "] = " + value);
            }

            public double end() {
                return 0;
            }
        };
        
        matrix.walkInRowOrder(preservingVisitor);

        // More unrelated computations
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("Sum of data array: " + sum);

        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        System.out.println("Written Vector: " + columnVector);
        System.out.println("Read Vector: " + readColumnVector);
        
        // Further unrelated operations
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector additionalVector = MatrixUtils.createColumnRealVector(additionalData);
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(new double[][]{{4.0}, {5.0}, {6.0}});
        
        RealVector additionalReadVector = additionalMatrix.getColumnVector(0);
        System.out.println("Additional Written Vector: " + additionalVector);
        System.out.println("Additional Read Vector: " + additionalReadVector);
    }
}