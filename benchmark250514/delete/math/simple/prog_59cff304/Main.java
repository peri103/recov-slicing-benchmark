import org.apache.commons.math3.linear.TriangularMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the TriangularMatrix with a size for demonstration purposes
        int size = 3;
        TriangularMatrix matrix = new TriangularMatrix(size);

        // Write a value to the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the read value
        System.out.println(value);
    }
}