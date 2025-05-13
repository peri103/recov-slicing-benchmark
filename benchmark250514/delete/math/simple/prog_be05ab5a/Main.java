import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with one column
        double[][] matrixData = {{0}, {0}, {0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column RealVector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{1, 2, 3});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Retrieve the column RealVector
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);
        
        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}