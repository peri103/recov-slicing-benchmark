import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with a single column
        double[][] data = { {1.0}, {2.0}, {3.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Write: Create a column real vector and set it in the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);
        
        // Read: Get the column real vector back from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Print the read vector to ensure it matches what was written
        System.out.println(readVector);
    }
}