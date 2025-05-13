import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{0.0, 0.0, 0.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row real vector
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        /* write */ matrix.setRowVector(0, vector);

        // Read the row real vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println(readVector);
    }
}