import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix with a size of 3x3 for demonstration purposes
        int size = 3;
        SymmetricMatrix matrix = new SymmetricMatrix(size);

        // Write a value into the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value read from the matrix
        System.out.println(value);
    }
}