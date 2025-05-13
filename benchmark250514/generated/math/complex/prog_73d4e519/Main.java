import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);

        // Write a value into the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 3.14);

        // Initialize another 3x3 matrix and fill it with random values
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                anotherMatrix.setEntry(i, j, Math.random() * 10);
            }
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);

        // Calculate the determinant of the multiplied matrix
        double determinant = MatrixUtils.inverse(multipliedMatrix).getEntry(0, 0);

        // Read the value from the original matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value from the original matrix
        System.out.println("Original matrix entry: " + value);

        // Print the determinant of the multiplied matrix
        System.out.println("Determinant of multiplied matrix: " + determinant);

        // Initialize a 5x5 matrix and fill it with sequential values
        RealMatrix sequentialMatrix = new Array2DRowRealMatrix(5, 5);
        double counter = 1.0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sequentialMatrix.setEntry(i, j, counter++);
            }
        }

        // Print the sequential matrix
        System.out.println("Sequential Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sequentialMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}