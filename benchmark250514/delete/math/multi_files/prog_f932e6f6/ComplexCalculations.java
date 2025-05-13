import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class ComplexCalculations {
    public RealVector addVectors(OpenMapRealVector vector1, OpenMapRealVector vector2) {
        return vector1.add(vector2);
    }

    public RealVector scaleVector(RealVector vector, double scale) {
        return vector.mapMultiply(scale);
    }

    public OpenMapRealVector subtractVectors(OpenMapRealVector vector1, OpenMapRealVector vector2) {
        return vector1.subtract(vector2);
    }
}
