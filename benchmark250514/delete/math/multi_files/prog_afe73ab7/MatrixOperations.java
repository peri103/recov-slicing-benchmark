import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] matrixData) {
        this.matrix = MatrixUtils.createRealMatrix(matrixData);
    }

    public void setRowVector(int rowIndex, double[] rowVectorData) {
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowVectorData);
        this.matrix.setRowVector(rowIndex, rowVector);
    }

    public RealVector getRowVector(int rowIndex) {
        return this.matrix.getRowVector(rowIndex);
    }

    public RealMatrix getMatrix() {
        return this.matrix;
    }
}
