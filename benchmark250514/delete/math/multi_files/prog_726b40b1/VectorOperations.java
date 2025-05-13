import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class VectorOperations {
    private RealVector vector;

    public VectorOperations(double[] values) {
        this.vector = MatrixUtils.createRealVector(values);
    }

    public RealVector addVector(RealVector otherVector) {
        return vector.add(otherVector);
    }

    public double getNorm() {
        return vector.getNorm();
    }

    public void printVector(RealVector vector) {
        System.out.println("Vector: " + vector);
    }
}
