import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0}; // Example data for the vector
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);
        
        System.out.println("Vector: " + readVector);
    }
}