import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealVector vector;

    public void createVector(double[] data) {
        /* write */ vector = MatrixUtils.createRowRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }
}
