import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SparseRealVector;

public class SparseVectorOperations {
    private SparseRealVector vector;

    public SparseVectorOperations(double[] data) {
        /* write */ vector = MatrixUtils.createSparseRealVector(data);
    }

    public SparseRealVector getVector() {
        return vector;
    }

    public SparseRealVector scaleVector(double factor) {
        return vector.mapMultiply(factor);
    }
}
