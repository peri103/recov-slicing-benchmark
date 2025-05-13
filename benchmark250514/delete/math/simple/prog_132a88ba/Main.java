import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 symmetric matrix
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Set an entry in the matrix
        /* write */ matrix.setEntry(1, 2, 5.0);

        // Read the entry from the matrix
        /* read */ double value = matrix.getEntry(1, 2);

        // Print the value to verify
        System.out.println(value);
    }
}