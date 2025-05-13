import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for creating a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Use MatrixUtils to create a RealMatrix from the 2D array
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Retrieve the 2D array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}