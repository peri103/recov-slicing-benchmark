import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 1x1
        DiagonalMatrix matrix = new DiagonalMatrix(1);
        
        // Set the value at position (0,0) to 5.0
        /* write */ matrix.setEntry(0, 5.0);
        
        // Retrieve the value at position (0,0)
        /* read */ double value = matrix.getEntry(0);
        
        // Output the retrieved value
        System.out.println(value);
    }
}