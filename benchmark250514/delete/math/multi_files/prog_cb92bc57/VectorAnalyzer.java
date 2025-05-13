import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class VectorAnalyzer {
    private ArrayRealVector vector;

    public void setVector(ArrayRealVector vector) {
        this.vector = vector;
    }

    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < this.vector.getDimension(); i++) {
            sum += this.vector.getEntry(i);
        }
        return sum;
    }

    public double calculateDotProduct(RealVector otherVector) {
        return this.vector.dotProduct(otherVector);
    }
}
