import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0, 0.0, 5.0};
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(data);

        // Read the sparse real vector using MatrixUtils
        /* read */ RealVector readSparseVector = MatrixUtils.getSparseRealVector(sparseVector);

        // Print the read sparse vector to verify
        System.out.println(readSparseVector);
    }
}