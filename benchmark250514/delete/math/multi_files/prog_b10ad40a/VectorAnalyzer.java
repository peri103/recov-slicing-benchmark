import org.apache.commons.math3.linear.SparseRealVector;

public class VectorAnalyzer {
    private SparseRealVector vector;

    public VectorAnalyzer(SparseRealVector vector) {
        this.vector = vector;
    }

    public double getVectorEntry(int index) {
        /* read */ return vector.getEntry(index);
    }
}
