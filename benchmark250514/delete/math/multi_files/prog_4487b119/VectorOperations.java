import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorOperations {

    public RealVector scaleVector(RealVector vector, double scalar) {
        return vector.mapMultiply(scalar);
    }

    public RealVector addVectors(RealVector vectorA, RealVector vectorB) {
        return vectorA.add(vectorB);
    }
}
