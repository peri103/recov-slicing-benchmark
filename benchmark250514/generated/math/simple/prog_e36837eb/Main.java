import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(2, 2);
        
        // Use the write method to set a value in the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Use the read method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify it is correct
        System.out.println(value);
    }
}