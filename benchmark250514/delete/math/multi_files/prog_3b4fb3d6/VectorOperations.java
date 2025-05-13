import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] data) {
        /* write */ this.vector = MatrixUtils.createArrayRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }

    public double calculateNorm() {
        return vector.getNorm();
    }

    public double calculateDotProduct(RealVector otherVector) {
        return vector.dotProduct(otherVector);
    }
}
