import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorOperations {
    private OpenMapRealVector vector;

    public VectorOperations(int size) {
        vector = new OpenMapRealVector(size);
    }

    public void setVectorEntry(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public double getVectorEntry(int index) {
        return vector.getEntry(index);
    }
}