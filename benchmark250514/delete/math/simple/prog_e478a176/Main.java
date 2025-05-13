import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with a single column vector
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Write: create a column real vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        matrix.setColumnVector(0, columnVector);

        // Read: get the column real vector
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        // Print the vector to verify the operation
        System.out.println(readColumnVector);
    }
}