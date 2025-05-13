import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix with a size of 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Write a value to the matrix at position (0, 1)
        /* write */ matrix.setEntry(0, 1, 5.0);

        // Read the value from the matrix at position (0, 1)
        /* read */ double value = matrix.getEntry(0, 1);

        // Print the value
        System.out.println(value);
    }
}