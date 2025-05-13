import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println(value);
    }
}