import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Using the MatrixUtils class to create and retrieve an ArrayRealVector
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);
        
        // Output the retrieved vector to verify
        System.out.println(retrievedVector);
    }
}