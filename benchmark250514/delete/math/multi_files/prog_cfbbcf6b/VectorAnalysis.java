import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class VectorAnalysis {
    private SparseVectorOperations vectorOperations;

    public VectorAnalysis(SparseVectorOperations vectorOperations) {
        this.vectorOperations = vectorOperations;
    }

    public SparseRealVector analyzeVector() {
        /* read */ SparseRealVector readVector = MatrixUtils.getSparseRealVector(vectorOperations.getVector());
        return readVector;
    }

    public double computeSum() {
        SparseRealVector vector = vectorOperations.getVector();
        double sum = 0;
        for (int i = 0; i < vector.getDimension(); i++) {
            sum += vector.getEntry(i);
        }
        return sum;
    }
}
