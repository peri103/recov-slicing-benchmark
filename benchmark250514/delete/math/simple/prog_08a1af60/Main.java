import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a column real vector using the write method
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{5.0, 6.0});
        
        // Set the column vector to the matrix at column index 0
        matrix.setColumnVector(0, columnVector);
        
        // Get the column real vector using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        // Print the values of the read column vector
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}