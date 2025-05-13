import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles
        double[] data = {1.0, 2.0, 3.0};
        
        // Use MatrixUtils to create a RealVector from the array
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Use MatrixUtils to retrieve the RealVector (though typically you'd just use the vector directly)
        /* read */ RealVector retrievedVector = MatrixUtils.createArrayRealVector(vector.toArray());
        
        // Print the values of the retrieved vector
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}