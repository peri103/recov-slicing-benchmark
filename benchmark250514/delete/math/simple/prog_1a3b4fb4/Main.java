import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with a size of 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        
        // Write a value to the matrix
        /* write */ matrix.setEntry(0, 1.5);
        
        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(0);
        
        // Print the read value
        System.out.println(value);
    }
}