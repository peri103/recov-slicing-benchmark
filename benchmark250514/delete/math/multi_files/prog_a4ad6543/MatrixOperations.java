import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    public RealVector operateMatrixVector(RealMatrix matrix, double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return matrix.operate(vector);
    }

    public RealMatrix multiplyMatrices(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1.multiply(matrix2);
    }
}
