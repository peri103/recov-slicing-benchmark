import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(double[] data) {
        /* write */ this.vector = MatrixUtils.createOpenMapRealVector(data);
    }

    public RealVector addVector(RealVector otherVector) {
        return vector.add(otherVector);
    }

    public double dotProduct(RealVector otherVector) {
        return vector.dotProduct(otherVector);
    }

    public OpenMapRealVector getVector() {
        return vector;
    }
}