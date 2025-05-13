import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial values
        double[] initialValues = {1.0, 0.0, 3.0, 0.0, 5.0};
        
        // Write operation
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(initialValues);

        // Read operation
        /* read */ RealVector readVector = sparseVector;

        // Output the vector to verify the read value
        System.out.println("Sparse Vector: " + readVector);
    }
}