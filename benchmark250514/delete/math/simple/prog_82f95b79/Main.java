import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to be used for matrix creation
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };

        // Create a matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Retrieve the matrix using the read method
        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved matrix data
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}