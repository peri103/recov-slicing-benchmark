import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(data);
        
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(sparseVector);
        
        // Print the retrieved vector
        System.out.println(retrievedVector);
    }
}