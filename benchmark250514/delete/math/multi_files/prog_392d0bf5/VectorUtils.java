import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorUtils {
    private OpenMapRealVector vector;

    public VectorUtils(int size) {
        /* write */ this.vector = MatrixUtils.createOpenMapRealVector(size);
    }

    public void setEntry(int index, double value) {
        vector.setEntry(index, value);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
