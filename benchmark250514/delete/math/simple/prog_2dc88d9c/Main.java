import org.apache.commons.math3.linear.DiagonalMatrix;

public class Main {
    public static void main(String[] args) {
        DiagonalMatrix matrix = new DiagonalMatrix(3); // Initialize a 3x3 diagonal matrix
        /* write */ matrix.setEntry(0, 1.5); // Set the first diagonal entry to 1.5
        /* read */ double value = matrix.getEntry(0); // Read the first diagonal entry
        System.out.println(value);
    }
}