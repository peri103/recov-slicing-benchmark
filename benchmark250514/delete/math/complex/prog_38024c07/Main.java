import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix using the write method
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create an unrelated matrix
        RealMatrix unrelatedMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        });

        // Perform operations on unrelated matrix
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = unrelatedMatrix.operate(vector);
        
        // Print result of unrelated operations
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Further unrelated operations
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);
        RealMatrix productMatrix = unrelatedMatrix.multiply(anotherMatrix);

        // Print the product of unrelated matrices
        System.out.println("Product of matrices:");
        for (int row = 0; row < productMatrix.getRowDimension(); row++) {
            for (int col = 0; col < productMatrix.getColumnDimension(); col++) {
                System.out.print(productMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read the diagonal matrix using the read method
        /* read */ double[] retrievedDiagonal = diagonalMatrix.getColumn(0);

        // Print the retrieved diagonal values to ensure correctness
        System.out.println("Retrieved diagonal values:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}