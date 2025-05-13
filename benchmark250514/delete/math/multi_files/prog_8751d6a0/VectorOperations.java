import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealVector vector;

    public void initializeVector(double[] data) {
        /* write */ vector = MatrixUtils.createArrayRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }
}
