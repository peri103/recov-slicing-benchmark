import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class SparseVectorManager {
    private SparseRealVector vector;

    public void createSparseVector(double[] data) {
        /* write */ vector = (SparseRealVector) MatrixUtils.createSparseRealVector(data);
    }

    public RealVector getSparseVector() {
        return vector;
    }
}
