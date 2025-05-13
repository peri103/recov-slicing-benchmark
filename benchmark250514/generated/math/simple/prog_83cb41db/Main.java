import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Write the value 5.0 to the position (1, 1) in the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);
        
        // Read the value from the position (1, 1) in the matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}