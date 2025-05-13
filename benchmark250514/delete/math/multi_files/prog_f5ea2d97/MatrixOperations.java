import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }

    public void modifyRow(int rowIndex, double[] rowData) {
        /* write */ matrix.setRowVector(rowIndex, MatrixUtils.createRowRealVector(rowData));
    }

    public RealVector getRow(int rowIndex) {
        return matrix.getRowVector(rowIndex);
    }

    public RealMatrix addMatrix(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }
}
