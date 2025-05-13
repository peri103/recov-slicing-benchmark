import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 1 row and 1 column
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(1, 1);
        
        // Write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 42.0);
        
        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value read from the matrix
        System.out.println(value);
    }
}