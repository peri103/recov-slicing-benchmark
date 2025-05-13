import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class RealVectorWrapper {
    private RealVector vector;

    public RealVectorWrapper(double[] data) {
        /* write */ this.vector = MatrixUtils.createSparseRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }
}
