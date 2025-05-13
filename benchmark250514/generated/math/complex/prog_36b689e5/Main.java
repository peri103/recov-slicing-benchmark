import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse matrix with 3 rows and 3 columns, filled with zeros
        RealMatrix sparseMatrix = MatrixUtils.createRealMatrix(3, 3);

        // Write a value into the sparse matrix
        /* write */ sparseMatrix.setEntry(0, 0, 1.0);

        // Additional operations on matrices
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(3, 3);
        anotherMatrix.setEntry(1, 1, 2.0);
        anotherMatrix.setEntry(2, 2, 3.0);

        // Perform matrix addition
        RealMatrix resultMatrix = sparseMatrix.add(anotherMatrix);

        // Intermediate calculations
        double sum = 0.0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in result matrix: " + sum);

        // Complex logic using loops and conditionals
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                if (resultMatrix.getEntry(i, j) > 0) {
                    System.out.println("Positive entry found at (" + i + ", " + j + "): " + resultMatrix.getEntry(i, j));
                }
            }
        }

        // Read the value from the sparse matrix
        /* read */ double value = sparseMatrix.getEntry(0, 0);

        System.out.println("Read value from sparse matrix: " + value);

        // Further operations
        RealMatrix transposedMatrix = resultMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}