import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.5);
        
        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}