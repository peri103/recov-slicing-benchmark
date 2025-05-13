import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Set the value at position (1, 1) to 5.0
        /* write */ matrix.setEntry(1, 1, 5.0);
        
        // Read the value at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println(value);
    }
}