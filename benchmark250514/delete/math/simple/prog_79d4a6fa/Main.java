import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Access the OpenMapRealVector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the vector elements to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}