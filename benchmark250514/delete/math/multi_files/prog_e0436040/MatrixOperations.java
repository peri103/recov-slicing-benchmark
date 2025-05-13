import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private RealMatrix diagonalMatrix;

    public void createDiagonalMatrix(double[] diagonalValues) {
        /* write */ diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
    }

    public RealMatrix getDiagonalMatrix() {
        return diagonalMatrix;
    }

    public double[][] getMatrixData() {
        return diagonalMatrix.getData();
    }
}
