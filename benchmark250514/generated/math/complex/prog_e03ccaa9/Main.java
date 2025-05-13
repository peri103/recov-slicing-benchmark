import org.apache.commons.math3.linear.RealMatrixChangingVisitor;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;

public class Main {
    public static void main(String[] args) {
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            private double sum = 0;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                sum = 0;
            }

            @Override
            public double visit(int row, int column, double value) {
                /* write */ sum += value;
                return value;
            }

            @Override
            public double end() {
                /* read */ return sum;
            }
        };

        RealMatrixPreservingVisitor preservingVisitor = new RealMatrixPreservingVisitor() {
            private double maxValue = Double.NEGATIVE_INFINITY;

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                maxValue = Double.NEGATIVE_INFINITY;
            }

            @Override
            public void visit(int row, int column, double value) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            @Override
            public double end() {
                return maxValue;
            }
        };

        // Example usage for RealMatrixChangingVisitor
        visitor.start(3, 3, 0, 2, 0, 2);
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(0, 2, 3.0);
        visitor.visit(1, 0, 4.0);
        visitor.visit(1, 1, 5.0);
        visitor.visit(1, 2, 6.0);
        visitor.visit(2, 0, 7.0);
        visitor.visit(2, 1, 8.0);
        visitor.visit(2, 2, 9.0);
        double sumResult = visitor.end();
        System.out.println("Sum of matrix elements: " + sumResult);

        // Example usage for RealMatrixPreservingVisitor
        preservingVisitor.start(3, 3, 0, 2, 0, 2);
        preservingVisitor.visit(0, 0, 1.0);
        preservingVisitor.visit(0, 1, 2.0);
        preservingVisitor.visit(0, 2, 3.0);
        preservingVisitor.visit(1, 0, 4.0);
        preservingVisitor.visit(1, 1, 5.0);
        preservingVisitor.visit(1, 2, 6.0);
        preservingVisitor.visit(2, 0, 7.0);
        preservingVisitor.visit(2, 1, 8.0);
        preservingVisitor.visit(2, 2, 9.0);
        double maxResult = preservingVisitor.end();
        System.out.println("Max element in matrix: " + maxResult);

        // Additional complex operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        double sumOfSquares = 0.0;
        for (int i = 0; i < matrixData.length; i++) {
            for (int j = 0; j < matrixData[i].length; j++) {
                sumOfSquares += Math.pow(matrixData[i][j], 2);
            }
        }
        System.out.println("Sum of squares of matrix elements: " + sumOfSquares);
    }
}