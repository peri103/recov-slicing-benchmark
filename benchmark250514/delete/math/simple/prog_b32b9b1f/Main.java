import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse real vector
        double[] data = {1.0, 0.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Reading the sparse real vector
        /* read */ RealVector readVector = vector; // Assuming getSparseRealVector returns the same vector
        System.out.println(readVector);
    }
}