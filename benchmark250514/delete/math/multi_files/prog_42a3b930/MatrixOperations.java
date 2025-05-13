import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class MatrixOperations {
    public RealMatrix transposeMatrix(double[][] data) {
        RealMatrix matrix = new BlockRealMatrix(data);
        return matrix.transpose();
    }
}
