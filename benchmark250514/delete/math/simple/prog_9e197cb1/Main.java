import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the write method
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Read the sparse real vector using the read method
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());

        // Print the values to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}