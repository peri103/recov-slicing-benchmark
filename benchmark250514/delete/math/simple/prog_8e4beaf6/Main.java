import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Creating a matrix with one column
        RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Writing a column vector to the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        
        // Reading the column vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Output the read vector
        System.out.println(readVector);
    }
}