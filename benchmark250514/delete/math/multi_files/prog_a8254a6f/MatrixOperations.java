import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Arrays;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createArray2DRowRealMatrix(data);
    }

    public RealVector multiplyWithVector(double[] vectorData) {
        RealVector vector = new ArrayRealVector(vectorData);
        return matrix.operate(vector);
    }

    public RealMatrix addMatrix(double[][] data) {
        RealMatrix matrix2 = MatrixUtils.createArray2DRowRealMatrix(data);
        return matrix.add(matrix2);
    }

    public double[][] getMatrixData() {
        /* read */ return matrix.getData();
    }
}
