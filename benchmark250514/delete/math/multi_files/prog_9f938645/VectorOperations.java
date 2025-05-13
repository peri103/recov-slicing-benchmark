import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    public RealVector addVectors(RealVector vector1, RealVector vector2) {
        return vector1.add(vector2);
    }

    public RealVector scaleVector(RealVector vector, double scalar) {
        return vector.mapMultiply(scalar);
    }
}
