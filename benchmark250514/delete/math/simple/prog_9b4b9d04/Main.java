import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial values
        double[] initialValues = {1.0, 2.0, 3.0};
        
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(initialValues);
        
        // Assuming getSparseRealVector() is a method to retrieve the vector
        // Here, we will simply use the same reference as there is no direct method like getSparseRealVector in MatrixUtils
        /* read */ RealVector retrievedVector = sparseVector;

        // Print out the values of the retrieved vector to verify
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}