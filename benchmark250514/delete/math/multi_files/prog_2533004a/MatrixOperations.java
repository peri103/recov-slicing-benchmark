import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class MatrixOperations {
    private BlockRealMatrix matrix;

    public void createMatrix(double[][] data) {
        /* write */ matrix = MatrixUtils.createBlockRealMatrix(data);
    }

    public BlockRealMatrix getMatrix() {
        return matrix;
    }
}
