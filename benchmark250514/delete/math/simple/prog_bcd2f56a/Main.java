import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal matrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        
        // Set the value at the first diagonal position
        /* write */ matrix.setEntry(0, 5.0);
        
        // Read the value from the first diagonal position
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value to verify
        System.out.println(value);
    }
}