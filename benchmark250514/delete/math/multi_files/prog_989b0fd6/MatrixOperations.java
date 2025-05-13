import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixFormat;

public class MatrixOperations {
    private RealMatrix matrix;

    public void createMatrix(double[][] data) {
        matrix = MatrixUtils.createRealMatrix(data);
    }

    public void printMatrix() {
        RealMatrixFormat formatter = new RealMatrixFormat();
        System.out.println("Matrix:");
        System.out.println(formatter.format(matrix));
    }
}
