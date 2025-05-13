import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Read the OpenMapRealVector using a method (simulated here as there is no direct 'get' method in MatrixUtils)
        /* read */ double value = vector.getEntry(0);
        
        System.out.println(value);
    }
}