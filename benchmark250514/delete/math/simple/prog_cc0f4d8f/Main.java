import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a vector to be written into the matrix
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = MatrixUtils.createRowRealVector(vectorData);

        /* write */ matrix.setRowVector(0, vector);

        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println(readVector);
    }
}