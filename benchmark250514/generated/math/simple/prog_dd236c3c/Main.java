import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Set a value in the matrix
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify it's correctly read
        System.out.println(value);
    }
}