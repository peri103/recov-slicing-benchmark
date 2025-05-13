import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] values) {
        vector = new ArrayRealVector(values);
    }

    public RealVector operate(RealMatrix matrix) {
        return matrix.operate(vector);
    }

    public void printVector(RealVector vector) {
        System.out.println("Resulting Vector:");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println(vector.getEntry(i));
        }
    }
}