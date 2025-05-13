import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a vector to write into the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Write the vector into the first row of the matrix
        /* write */ matrix.setRowVector(0, vector);

        // Read the vector from the first row of the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read vector: " + readVector);
    }
}