import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with a single column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector using the write method
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);
        
        // Retrieve the RealVector using the read method
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);
        
        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}