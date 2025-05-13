import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with 1 row and 1 column
        BlockRealMatrix matrix = new BlockRealMatrix(1, 1);
        
        // Write a value to the matrix at position (0,0)
        /* write */ matrix.setEntry(0, 0, 3.14);
        
        // Read the value from the matrix at position (0,0)
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}