import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);

        // Populate the sparse matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);

        // Create another matrix for additional complexity
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(3, 3);
        denseMatrix.setEntry(0, 0, 4.0);
        denseMatrix.setEntry(1, 1, 5.0);
        denseMatrix.setEntry(2, 2, 6.0);

        // Perform matrix addition
        RealMatrix resultMatrix = sparseMatrix.add(denseMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Use a matrix visitor for additional complexity
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            @Override
            public double visit(int row, int column, double value) {
                return value * 2; // Double the value
            }

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // No action needed on start
            }

            @Override
            public double end() {
                return 0; // No specific result needed
            }
        };

        // Apply the visitor to the result matrix
        resultMatrix.walkInOptimizedOrder(visitor);

        // Print the modified matrix
        System.out.println("Modified matrix after applying visitor:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ MatrixUtils.createSparseMatrix(3, 3); // This line is executed once

        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2.5;
        }
        System.out.println("Sum of series: " + sum);

        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix); // This line is executed once

        // Print the retrieved matrix to verify the read operation
        System.out.println("Retrieved sparse matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}