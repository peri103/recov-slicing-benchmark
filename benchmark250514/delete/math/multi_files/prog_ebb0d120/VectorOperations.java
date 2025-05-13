import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] data) {
        vector = new ArrayRealVector(data);
    }

    public RealVector operateWithMatrix(RealMatrix matrix) {
        return matrix.operate(vector);
    }
}
