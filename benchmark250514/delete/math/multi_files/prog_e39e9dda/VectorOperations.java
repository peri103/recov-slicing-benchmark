import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(int size) {
        vector = MatrixUtils.createOpenMapRealVector(size);
    }

    public void setEntry(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
