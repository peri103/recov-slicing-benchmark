import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int cols) {
        this.matrix = MatrixUtils.createRealMatrix(rows, cols);
    }

    public void setMatrixEntry(int row, int col, double value) {
        /* write */ matrix.setEntry(row, col, value);
    }

    public double getMatrixEntry(int row, int col) {
        /* read */ return matrix.getEntry(row, col);
    }

    public RealMatrix addMatrices(RealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix subtractMatrices(RealMatrix otherMatrix) {
        return matrix.subtract(otherMatrix);
    }

    public RealVector multiplyWithVector(RealVector vector) {
        return matrix.operate(vector);
    }
}
