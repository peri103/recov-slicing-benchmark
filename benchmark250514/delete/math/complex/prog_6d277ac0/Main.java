import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize another matrix for additional complexity
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(3, 3);
        
        // Populate the other matrix with random values
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                anotherMatrix.setEntry(i, j, rand.nextDouble() * 10);
            }
        }

        // Perform some operations on the other matrix
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += anotherMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of anotherMatrix entries: " + sum);

        /* write */ matrix.setEntry(0, 1, 5.0);

        // Perform additional unrelated operations
        double diagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            diagonalSum += anotherMatrix.getEntry(i, i);
        }
        System.out.println("Sum of diagonal of anotherMatrix: " + diagonalSum);

        // Even more complex calculations
        double product = 1;
        for (int i = 0; i < 3; i++) {
            product *= anotherMatrix.getEntry(i, i);
        }
        System.out.println("Product of diagonal of anotherMatrix: " + product);

        /* read */ double value = matrix.getEntry(0, 1);
        System.out.println("Value from symmetric matrix: " + value);
    }
}