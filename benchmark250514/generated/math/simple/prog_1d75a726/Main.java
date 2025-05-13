import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3); // Initialize a 3x3 matrix
        
        /* write */ matrix.setEntry(1, 1, 5.0); // Set the entry at row 1, column 1 to 5.0
        
        /* read */ double value = matrix.getEntry(1, 1); // Get the entry at row 1, column 1
        System.out.println(value);
    }
}