import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Write a value at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value
        System.out.println(value);
    }
}