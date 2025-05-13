import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a matrix with a single column using the write method
        RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Read the column vector using the read method
        /* read */ RealVector columnVector = matrix.getColumnVector(0);
        
        // Print the column vector to verify the read operation
        System.out.println(columnVector);
    }
}