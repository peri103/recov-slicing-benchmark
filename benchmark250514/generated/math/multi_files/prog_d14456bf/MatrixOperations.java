import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MatrixOperations {
    private BlockRealMatrix matrix;
    
    public MatrixOperations(int rows, int columns) {
        this.matrix = new BlockRealMatrix(rows, columns);
    }

    public void setMatrixEntry(int row, int column, double value) {
        /* write */ matrix.setEntry(row, column, value);
    }

    public double getMatrixEntry(int row, int column) {
        return matrix.getEntry(row, column);
    }

    public RealMatrix addMatrices(BlockRealMatrix otherMatrix) {
        return matrix.add(otherMatrix);
    }

    public RealMatrix multiplyMatrices(BlockRealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }
}
