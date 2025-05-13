import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class MatrixOperations {
    private RealMatrix matrix;
    
    public MatrixOperations(int rows, int columns) {
        this.matrix = MatrixUtils.createRealMatrix(rows, columns);
    }
    
    public void setColumnVector(int columnIndex, double[] data) {
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(data);
        matrix.setColumnVector(columnIndex, columnVector);
    }

    public RealVector getColumnVector(int columnIndex) {
        return matrix.getColumnVector(columnIndex);
    }
    
    public RealMatrix multiply(RealMatrix otherMatrix) {
        return matrix.multiply(otherMatrix);
    }
}
