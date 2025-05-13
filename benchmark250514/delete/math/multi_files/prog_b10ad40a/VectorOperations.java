import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class VectorOperations {
    private SparseRealVector vector;

    public VectorOperations() {
        this.vector = new OpenMapRealVector();
    }

    public void setVectorEntry(int index, double value) {
        /* write */ vector.setEntry(index, value);
    }

    public SparseRealVector getVector() {
        return vector;
    }
}
