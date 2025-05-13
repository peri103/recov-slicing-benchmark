import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] data) {
        this.vector = new ArrayRealVector(data);
    }

    public RealVector scaleVector(double scalar) {
        return vector.mapMultiply(scalar);
    }

    public RealVector addVectors(RealVector otherVector) {
        return vector.add(otherVector);
    }

    public RealVector getVector() {
        return vector;
    }
}
