import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to use with the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a RealMatrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Read the matrix back using the MatrixUtils class
        /* read */ double[][] readData = matrix.getData();
        
        // Output the read data to verify
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}