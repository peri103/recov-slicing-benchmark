import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with a specific size
        int size = 3; // example size
        SymmetricMatrix matrix = new SymmetricMatrix(size);
        
        // Set a value in the matrix
        int row = 0, column = 1;
        double valueToWrite = 5.0;
        /* write */ matrix.setEntry(row, column, valueToWrite);
        
        // Read the value back from the matrix
        /* read */ double valueRead = matrix.getEntry(row, column);
        
        // Print the value to verify it was written and read correctly
        System.out.println(valueRead);
    }
}