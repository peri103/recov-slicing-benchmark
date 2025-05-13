import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(double[] data) {
        /* write */ this.vector = MatrixUtils.createOpenMapRealVector(data);
    }

    public void modifyVector() {
        vector.setEntry(0, 10.0);
        vector.setEntry(1, 20.0);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
