import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private ArrayRealVector vector;

    public void initializeVector(double[] data) {
        /* write */ this.vector = MatrixUtils.createArrayRealVector(data);
    }

    public ArrayRealVector getVector() {
        return this.vector;
    }

    public RealVector scaleVector(double scaleFactor) {
        return this.vector.mapMultiply(scaleFactor);
    }

    public double calculateNorm() {
        return this.vector.getNorm();
    }
}
