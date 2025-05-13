import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the write method
        SparseRealVector vector = (SparseRealVector) /* write */ MatrixUtils.createSparseRealVector(new double[]{1.0, 2.0, 3.0});

        // Read the sparse real vector using the read method
        RealVector readVector = /* read */ MatrixUtils.getSparseRealVector(vector);

        // Print the vector to ensure the read method retrieves the written data
        System.out.println(readVector);
    }
}