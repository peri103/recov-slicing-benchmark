import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void modifyRow(int rowIndex, double[] rowData) {
        RealVector rowVector = MatrixUtils.createRowRealVector(rowData);
        /* write */ matrix.setRowVector(rowIndex, rowVector);
    }

    public RealVector getRowVector(int rowIndex) {
        return matrix.getRowVector(rowIndex);
    }

    public RealMatrix getMatrix() {
        return matrix;
    }

    public RealMatrix transposeMatrix() {
        return matrix.transpose();
    }

    public RealMatrix scalarMultiply(double scalar) {
        return matrix.scalarMultiply(scalar);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }
}
