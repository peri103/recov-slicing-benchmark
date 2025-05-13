import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and some columns
        double[][] matrixData = {{1.0, 2.0, 3.0, 4.0, 5.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector using createRowRealVector and write it to the first row of the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{10.0, 20.0, 30.0, 40.0, 50.0});
        /* write */ matrix.setRowVector(0, vector);

        // Read the RealVector from the first row of the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println(readVector);
    }
}