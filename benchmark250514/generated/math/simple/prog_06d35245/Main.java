import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix using MatrixUtils
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Read the matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrix; // Directly using the matrix object created by createRealMatrix
        System.out.println(readMatrix);
    }
}