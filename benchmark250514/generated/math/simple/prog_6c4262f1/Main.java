import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        /* read */ RealVector readVector = vector; // MatrixUtils does not have getRealVector, assuming direct access
        System.out.println(readVector);
    }
}