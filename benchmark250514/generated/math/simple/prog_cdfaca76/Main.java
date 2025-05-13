import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to be used for matrix creation
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        
        // Create a 2D row real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Retrieve the 2D row real matrix using the MatrixUtils class
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved matrix data to verify
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}