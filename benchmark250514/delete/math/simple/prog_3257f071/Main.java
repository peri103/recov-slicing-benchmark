import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the MatrixUtils class
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(new double[]{1.0, 2.0, 3.0});

        // Retrieve the sparse real vector using the MatrixUtils class
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(sparseVector.toArray());

        // Print the elements of the retrieved vector to verify
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}