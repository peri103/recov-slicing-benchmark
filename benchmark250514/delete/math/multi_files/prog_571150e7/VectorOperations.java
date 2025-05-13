import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] data) {
        /* write */ this.vector = MatrixUtils.createArrayRealVector(data);
    }

    public RealVector getVector() {
        return vector;
    }

    public double dotProduct(double[] data) {
        RealVector otherVector = MatrixUtils.createArrayRealVector(data);
        return vector.dotProduct(otherVector);
    }

    public RealVector addVectors(double[] data) {
        RealVector otherVector = MatrixUtils.createArrayRealVector(data);
        return vector.add(otherVector);
    }
}
