import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] row = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(row);
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        System.out.println("Row matrix: " + readMatrix);
    }
}