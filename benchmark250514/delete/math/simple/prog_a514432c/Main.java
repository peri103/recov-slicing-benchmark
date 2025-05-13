import org.apache.commons.math3.linear.TriangularMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the TriangularMatrix with a size, for example, 3x3
        TriangularMatrix matrix = new TriangularMatrix(3);

        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the read value to verify correctness
        System.out.println(value);
    }
}