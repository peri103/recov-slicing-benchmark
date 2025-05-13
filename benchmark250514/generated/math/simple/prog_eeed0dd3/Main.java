import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix with 1 row and 1 column
        Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(1, 1);
        
        // Use the write method to set a value at row 0, column 0
        /* write */ matrix.setEntry(0, 0, 42.0);
        
        // Use the read method to retrieve the value from row 0, column 0
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the retrieved value
        System.out.println(value);
    }
}