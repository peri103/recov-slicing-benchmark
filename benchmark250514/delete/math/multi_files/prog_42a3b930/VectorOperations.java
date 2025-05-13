import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;

public class VectorOperations {
    private ArrayRealVector vector;

    public void createVector(double[] data) {
        /* write */
        this.vector = MatrixUtils.createArrayRealVector(data);
    }

    public ArrayRealVector getVector() {
        return this.vector;
    }
}
