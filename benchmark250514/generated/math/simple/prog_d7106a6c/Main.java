import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a BlockRealMatrix with 3 rows and 3 columns
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Write a value at row 1, column 1
        /* write */ matrix.setEntry(1, 1, 5.0);
        
        // Read the value at row 1, column 1
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the read value
        System.out.println(value);
    }
}