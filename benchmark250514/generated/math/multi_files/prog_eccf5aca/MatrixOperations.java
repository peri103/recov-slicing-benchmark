import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;
    
    public MatrixOperations(double[][] data) {
        this.matrix = MatrixUtils.createRealMatrix(data);
    }
    
    public void setColumnVector(int columnIndex, RealVector vector) {
        /* write */ matrix.setColumnVector(columnIndex, vector);
    }
    
    public RealVector getColumnVector(int columnIndex) {
        return matrix.getColumnVector(columnIndex);
    }
    
    public RealMatrix getMatrix() {
        return matrix;
    }
}
