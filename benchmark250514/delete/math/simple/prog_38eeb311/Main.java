import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix for demonstration purposes
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Use the write method to create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{5.0, 6.0});
        /* write */ matrix.setRowVector(0, rowVector);

        // Use the read method to get the row vector
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector to verify the operations
        System.out.println("Read Vector: " + readVector);
    }
}