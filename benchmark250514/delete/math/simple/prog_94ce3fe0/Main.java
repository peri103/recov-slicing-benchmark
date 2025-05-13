import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector with some values
        double[] values = {1.0, 2.0, 3.0};
        
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);
        
        // Read the vector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the values to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}