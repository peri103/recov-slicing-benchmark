import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(int size) {
        this.vector = MatrixUtils.createOpenMapRealVector(size);
    }

    public void writeValue(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
