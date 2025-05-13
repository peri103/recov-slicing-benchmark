import org.apache.commons.math3.linear.TriangularMatrix;

public class Main {
    public static void main(String[] args) {
        // Assuming TriangularMatrix is a class that can be initialized directly
        // This is a hypothetical example since the actual TriangularMatrix class
        // might not exist in the Apache Commons Math library with direct instantiation.
        TriangularMatrix matrix = new TriangularMatrix(3); // Assuming a 3x3 matrix
        
        /* write */ matrix.setEntry(0, 0, 5.0); // Set the entry at row 0, column 0 to 5.0
        
        /* read */ double value = matrix.getEntry(0, 0); // Read the entry at row 0, column 0
        
        System.out.println(value); // Should print 5.0
    }
}