import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Write operation: create a sparse real vector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Read operation: get the sparse real vector (in this case, it's already stored in 'vector')
        /* read */ RealVector readVector = vector;

        // Output the vector to verify the read operation
        System.out.println(readVector);
    }
}