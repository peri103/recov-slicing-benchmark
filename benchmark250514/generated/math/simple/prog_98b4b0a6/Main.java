import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 1 row and 1 column
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(1, 1);
        
        // Set the value at row 0, column 0 to 5.0
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Read the value at row 0, column 0
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to ensure it was set and read correctly
        System.out.println(value);
    }
}