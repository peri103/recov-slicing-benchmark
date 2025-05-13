import org.apache.commons.math3.linear.TriangularMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a TriangularMatrix with a size of 3 (for example)
        TriangularMatrix matrix = new TriangularMatrix(3);
        
        // Set an entry in the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Retrieve the entry from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify
        System.out.println(value);
    }
}