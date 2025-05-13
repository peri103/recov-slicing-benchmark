import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix with a size of 3x3 for demonstration purposes
        int size = 3;
        SymmetricMatrix matrix = new SymmetricMatrix(size);

        // Initialize another symmetric matrix with random values
        SymmetricMatrix randomMatrix = new SymmetricMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                randomMatrix.setEntry(i, j, Math.random() * 10);
            }
        }

        // Write a value into the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Perform some operations on the random matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(size);
        RealMatrix resultMatrix = randomMatrix.multiply(identityMatrix);

        // Output the random matrix and the result of multiplication
        System.out.println("Random Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(randomMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value read from the matrix
        System.out.println("Value at (1,1): " + value);

        // Perform additional operations on the symmetric matrix
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of elements in the symmetric matrix: " + sum);
    }
}