import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(double[] initialValues) {
        /* write */ this.vector = MatrixUtils.createOpenMapRealVector(initialValues);
    }

    public RealVector scaleVector(double scalar) {
        return vector.mapMultiply(scalar);
    }

    public RealVector addVector(RealVector otherVector) {
        return vector.add(otherVector);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}
