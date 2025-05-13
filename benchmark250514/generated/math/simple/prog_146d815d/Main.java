import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with a 2x2 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);

        // Use the setEntry method to write a value to the matrix
        /* write */ matrix.setEntry(0, 0, 3.14);

        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify it is correctly read
        System.out.println(value);
    }
}