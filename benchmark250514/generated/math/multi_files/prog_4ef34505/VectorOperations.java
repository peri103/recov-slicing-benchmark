import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private ArrayRealVector vector;

    public VectorOperations(int size) {
        this.vector = new ArrayRealVector(size);
    }

    public void setVectorEntry(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public double getVectorEntry(int index) {
        return vector.getEntry(index);
    }

    public RealVector scaleVector(double scale) {
        return vector.mapMultiply(scale);
    }

    public RealVector addVector(RealVector otherVector) {
        return vector.add(otherVector);
    }

    public RealVector subtractVector(RealVector otherVector) {
        return vector.subtract(otherVector);
    }

    public RealVector normalizeVector() {
        return vector.unitVector();
    }
}
