import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with dimensions 3x3
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Write a value into the matrix at position (1,1)
        /* write */ matrix.setEntry(1, 1, 42.0);

        // Read the value from the matrix at position (1,1)
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value to ensure correctness
        System.out.println(value);
    }
}