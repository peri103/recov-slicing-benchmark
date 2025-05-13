import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the array for the diagonal matrix
        double[] diagonal = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);
        
        // Retrieve the diagonal matrix values
        /* read */ double[] retrievedDiagonal = matrix.getColumn(0); // Assuming the method to get diagonal elements
        
        // Print the retrieved diagonal values
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}