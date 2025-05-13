import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations() {
        vector = new ArrayRealVector(3);
    }

    public void setVectorEntry(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public RealVector getVector() {
        return vector;
    }
}
