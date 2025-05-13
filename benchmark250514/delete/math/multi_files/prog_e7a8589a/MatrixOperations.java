import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    public RealMatrix addMatrices(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1.add(matrix2);
    }

    public RealVector multiplyMatrixVector(RealMatrix matrix, RealVector vector) {
        return matrix.operate(vector);
    }

    public RealMatrix multiplyMatrices(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1.multiply(matrix2);
    }
}
