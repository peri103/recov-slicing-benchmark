import org.apache.commons.math3.linear.TriangularMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 triangular matrix
        TriangularMatrix matrix = new TriangularMatrix(3);

        /* write */ matrix.setEntry(0, 0, 5.0); // Set the value at position (0,0)

        /* read */ double value = matrix.getEntry(0, 0); // Read the value at position (0,0)

        System.out.println(value);
    }
}