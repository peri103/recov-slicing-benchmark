import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify it matches the original
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}