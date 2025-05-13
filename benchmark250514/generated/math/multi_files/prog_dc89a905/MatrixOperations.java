import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[] rowData) {
        /* write */ matrix = MatrixUtils.createRowRealMatrix(rowData);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix addMatrices(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix multiplyMatrices(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }

    public RealVector scaleVector(double factor) {
        RealVector vector = new ArrayRealVector(matrix.getRow(0));
        return vector.mapMultiply(factor);
    }
}
