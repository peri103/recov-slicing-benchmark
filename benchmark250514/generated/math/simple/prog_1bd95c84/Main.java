import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);

        // Write value to the matrix
        /* write */ matrix.setEntry(1, 1, 42.0);

        // Read value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the value
        System.out.println(value);
    }
}