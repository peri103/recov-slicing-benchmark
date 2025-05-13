import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        /* read */ RealVector readVector = vector; // Since MatrixUtils does not have a getRealVector method, we use the created vector directly
        
        // Print the vector to verify
        System.out.println("Vector: " + readVector);
    }
}