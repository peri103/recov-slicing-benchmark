import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using the write method
        /* write */ SparseRealVector sparseVector = (SparseRealVector) MatrixUtils.createSparseRealVector(new double[]{1.0, 2.0, 3.0});

        // Read the sparse real vector using the read method
        /* read */ RealVector readVector = sparseVector;

        // Print the elements of the vector to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}