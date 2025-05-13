import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector
        OpenMapRealVector vector = new OpenMapRealVector(5);
        
        // Write operation: using createOpenMapRealVector method
        /* write */ vector = MatrixUtils.createOpenMapRealVector(new double[] {1.0, 2.0, 3.0, 4.0, 5.0});
        
        // Read operation: using getOpenMapRealVector method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the read values to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}