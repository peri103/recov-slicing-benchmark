import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix of size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);
        
        // Set an entry in the matrix
        /* write */ matrix.setEntry(0, 1, 5.0);
        
        // Read the entry from the matrix
        /* read */ double value = matrix.getEntry(0, 1);
        
        // Print the value to verify it was set correctly
        System.out.println(value);
    }
}