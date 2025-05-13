import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for matrix creation
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};

        // Create a RealMatrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Retrieve the array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved data to verify correctness
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}