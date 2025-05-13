import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 1
        DiagonalMatrix matrix = new DiagonalMatrix(1);
        
        // Write a value at index 0
        /* write */ matrix.setEntry(0, 5.0);
        
        // Read the value at index 0
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value to verify
        System.out.println(value);
    }
}