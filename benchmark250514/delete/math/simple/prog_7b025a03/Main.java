import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix with all elements initialized to 0
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Create a column vector with specific values
        double[] columnData = {1.0, 2.0, 3.0};
        RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        
        /* write */ matrix.setColumnVector(0, columnVector); // Set the first column of the matrix

        /* read */ RealVector readVector = matrix.getColumnVector(0); // Read the first column of the matrix
        System.out.println(readVector);
    }
}