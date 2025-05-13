import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Write the 2D array to a RealMatrix object using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Read the 2D array from the RealMatrix object
        /* read */ double[][] readData = matrix.getData();
        
        // Print the read data
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}