import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix with a size of 3x3 for example
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Write a value to the matrix at position (1, 2)
        /* write */ matrix.setEntry(1, 2, 5.0);

        // Read the value from the matrix at position (1, 2)
        /* read */ double value = matrix.getEntry(1, 2);

        // Print the value to verify it matches what was written
        System.out.println(value);
    }
}