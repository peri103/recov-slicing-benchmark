import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to create a sparse real vector
        double[] data = {1.0, 2.0, 3.0};

        /* write */ SparseRealVector vector = MatrixUtils.createSparseRealVector(data);

        /* read */ SparseRealVector readVector = MatrixUtils.getSparseRealVector(vector);

        // Print the read vector to verify
        System.out.println(readVector);
    }
}