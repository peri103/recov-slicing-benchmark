import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    public RealMatrix createMatrix(double[][] data) {
        return MatrixUtils.createArray2DRowRealMatrix(data);
    }

    public double[][] getMatrixData(RealMatrix matrix) {
        /* read */ return matrix.getData();
    }
}
