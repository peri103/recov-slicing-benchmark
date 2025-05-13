import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations with a 3x3 matrix
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        
        // Initialize and modify matrix
        matrixOps.initializeMatrix();
        matrixOps.modifyEntry(1, 1, 5.0);

        // Perform operations
        RealMatrix transposedMatrix = matrixOps.getTransposedMatrix();
        double sum = matrixOps.sumAllElements();

        // Print transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print sum of all elements
        System.out.println("Sum of all elements in the matrix: " + sum);

        // Read the modified entry
        /* read */ double value = matrixOps.getMatrix().getEntry(1, 1);
        System.out.println("Value at (1,1): " + value);
    }
}