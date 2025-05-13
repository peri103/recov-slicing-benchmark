import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a DiagonalMatrix with one element
        DiagonalMatrix matrix = new DiagonalMatrix(1);
        
        // Set the value at index 0
        /* write */ matrix.setEntry(0, 42.0);

        // Retrieve the value at index 0
        /* read */ double value = matrix.getEntry(0);

        // Print the value
        System.out.println(value);
    }
}