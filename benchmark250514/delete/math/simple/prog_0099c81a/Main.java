import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array to initialize the matrix
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        // Create a RealMatrix from the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector to be written to the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{1, 2, 3});

        /* write */
        matrix.setRowVector(1, vector);

        /* read */
        RealVector readVector = matrix.getRowVector(1);

        System.out.println("Read vector: " + readVector);
    }
}