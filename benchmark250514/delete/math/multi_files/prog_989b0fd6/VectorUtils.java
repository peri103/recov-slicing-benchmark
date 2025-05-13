import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorUtils {
    private ArrayRealVector vector;

    public void createVector(double[] data) {
        /* write */ vector = MatrixUtils.createArrayRealVector(data);
    }

    public ArrayRealVector getVector() {
        return vector;
    }
}
