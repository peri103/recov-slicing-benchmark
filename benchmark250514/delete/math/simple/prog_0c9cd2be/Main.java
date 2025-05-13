import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        
        // Use the setEntry method to write a value to the matrix
        /* write */ matrix.setEntry(0, 5.0);
        
        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value to ensure it was correctly read
        System.out.println(value);
    }
}