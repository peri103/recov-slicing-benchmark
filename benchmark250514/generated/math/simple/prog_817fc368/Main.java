import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zeros
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println(value);
    }
}