import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 3 rows and 3 columns
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        // Write a value into the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println(value);
    }
}