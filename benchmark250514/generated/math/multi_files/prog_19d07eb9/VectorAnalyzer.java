import org.apache.commons.math3.linear.OpenMapRealVector;

public class VectorAnalyzer {
    private OpenMapRealVector vector;

    public VectorAnalyzer(OpenMapRealVector vector) {
        this.vector = vector;
    }

    public double getEntry(int index) {
        /* read */ return vector.getEntry(index);
    }

    public double calculateProduct() {
        double product = 1;
        for (int i = 1; i < vector.getDimension(); i++) {
            product *= vector.getEntry(i);
        }
        return product;
    }
}