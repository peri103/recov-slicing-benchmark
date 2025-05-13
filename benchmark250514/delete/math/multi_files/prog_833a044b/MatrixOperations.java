import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createIdentityMatrix(int size) {
        /* write */ this.matrix = MatrixUtils.createIdentityMatrix(size);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return this.matrix.add(otherMatrix);
    }
}
