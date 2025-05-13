import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the sparse real vector
        double[] data = {1.0, 0.0, 2.0, 0.0, 3.0};

        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);

        // Print the read vector to verify
        System.out.println(readVector);
    }
}