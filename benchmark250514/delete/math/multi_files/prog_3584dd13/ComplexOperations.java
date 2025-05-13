import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class ComplexOperations {
    private RealMatrix matrix;

    public ComplexOperations(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public RealVector multiplyWithVector() {
        int size = matrix.getRowDimension();
        RealVector vector = new ArrayRealVector(size);
        for (int i = 0; i < size; i++) {
            vector.setEntry(i, i + 1);
        }
        return matrix.operate(vector);
    }

    public RealMatrix addMatrix(RealMatrix anotherMatrix) {
        return matrix.add(anotherMatrix);
    }
}
