import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        RealMatrix denseMatrix = new Array2DRowRealMatrix(3, 3);

        // Initialize denseMatrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                denseMatrix.setEntry(i, j, i * j);
            }
        }

        // Perform some operations on denseMatrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        double sum = 0.0;
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                sum += transposedMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of transposed matrix entries: " + sum);

        /* write */ matrix.setEntry(1, 1, 5.0);

        // Use another SparseRealMatrix for additional operations
        SparseRealMatrix anotherMatrix = new OpenMapRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 2.5);
        anotherMatrix.setEntry(2, 2, 3.5);

        // Perform addition of matrices
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        System.out.println("Result matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Insert some unrelated complex logic
        int[] numbers = {1, 2, 3, 4, 5};
        int factorial = 1;
        for (int number : numbers) {
            factorial *= number;
        }
        System.out.println("Factorial of numbers array: " + factorial);

        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Read value from matrix: " + value);
    }
}