import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the SparseRealMatrix
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        
        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);
        
        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify
        System.out.println(value);
    }
}