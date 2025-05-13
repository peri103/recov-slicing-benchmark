import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a BlockRealMatrix with dimensions 2x2
        BlockRealMatrix matrix = new BlockRealMatrix(2, 2);

        // Write a value to the matrix at position (0, 0)
        /* write */ matrix.setEntry(0, 0, 5.5);

        // Read the value from the matrix at position (0, 0)
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the read value
        System.out.println(value);
    }
}