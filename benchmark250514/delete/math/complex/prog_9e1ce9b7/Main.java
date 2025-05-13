import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 1x1
        DiagonalMatrix matrix = new DiagonalMatrix(1);

        // Set the value at position (0,0) to 5.0
        /* write */ matrix.setEntry(0, 5.0);

        // Create another matrix for more complexity
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2},
            {3, 4}
        });

        // Multiply the two matrices
        RealMatrix result = matrix2.multiply(MatrixUtils.createRealDiagonalMatrix(new double[] {matrix.getEntry(0)}));

        // Print the result of the multiplication
        for (int i = 0; i < result.getRowDimension(); i++) {
            for (int j = 0; j < result.getColumnDimension(); j++) {
                System.out.print(result.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some operations with the original matrix
        double sum = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            sum += matrix.getEntry(i);
        }
        
        // Output the sum of the diagonal elements
        System.out.println("Sum of diagonal elements: " + sum);

        // Retrieve the value at position (0,0)
        /* read */ double value = matrix.getEntry(0);

        // Output the retrieved value
        System.out.println("Retrieved value: " + value);

        // Additional operations for more complexity
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix addedMatrix = identity.add(matrix2);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}