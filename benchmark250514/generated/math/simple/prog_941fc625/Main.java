import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        /* read */ RealVector readVector = vector;
        
        System.out.println("Read Vector: " + readVector);
    }
}