import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse vector with a size and an initial value.
        double[] initialValues = {1.0, 2.0, 3.0};
        
        /* write */
        RealVector vector = MatrixUtils.createSparseRealVector(initialValues);
        
        /* read */
        RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());
        
        // Print the values to verify they match the written values.
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}