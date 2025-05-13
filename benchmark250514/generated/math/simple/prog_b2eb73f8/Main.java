import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix object with a 2x2 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(2, 2);
        
        // Use the setEntry method to write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}