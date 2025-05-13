import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class RealVectorOperations {
    private RealVector vector;

    public void createVector(double[] data) {
        /* write */ vector = MatrixUtils.createRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }
}
