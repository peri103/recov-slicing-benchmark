import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(int size) {
        /* write */ vector = MatrixUtils.createOpenMapRealVector(size);
    }

    public void setValues(double[] values) {
        for (int i = 0; i < values.length; i++) {
            vector.setEntry(i, values[i]);
        }
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
