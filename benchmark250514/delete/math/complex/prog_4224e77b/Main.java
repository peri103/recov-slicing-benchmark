import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize another matrix for complex operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(3, 3);

        // Populate anotherMatrix with random values
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                anotherMatrix.setEntry(i, j, random.nextDouble() * 10);
            }
        }

        // Perform some operations on anotherMatrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        RealMatrix addedMatrix = anotherMatrix.add(transposedMatrix);

        // Write a value at position (1, 1) in the symmetric matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform more operations on anotherMatrix
        RealMatrix multipliedMatrix = anotherMatrix.multiply(transposedMatrix);

        // Read the value from position (1, 1) in the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println("Value from symmetric matrix: " + value);

        // Print some values from the addedMatrix for complexity
        System.out.println("Added Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print some values from the multipliedMatrix for complexity
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}