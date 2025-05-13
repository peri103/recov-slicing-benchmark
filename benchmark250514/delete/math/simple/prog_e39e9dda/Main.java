import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Set some values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Read the OpenMapRealVector using MatrixUtils
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to verify
        System.out.println(readVector.getEntry(0));
        System.out.println(readVector.getEntry(1));
        System.out.println(readVector.getEntry(2));
    }
}