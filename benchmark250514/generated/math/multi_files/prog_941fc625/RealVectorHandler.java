import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class RealVectorHandler {
    private RealVector vector;

    public void createVector(double[] data) {
        /* write */ vector = MatrixUtils.createRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }
}
