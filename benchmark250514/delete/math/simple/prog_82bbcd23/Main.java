import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a new DiagonalMatrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);

        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 5.0);

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1);

        // Print the value to ensure the read method works correctly
        System.out.println(value);
    }
}