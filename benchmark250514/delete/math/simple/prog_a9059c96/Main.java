import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a column real vector
        /* write */ RealVector vector = MatrixUtils.createColumnRealVector(data);
        
        // Create a matrix using the vector
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        
        // Get the column real vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        System.out.println(readVector);
    }
}