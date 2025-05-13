import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        double[] rowData = {7.0, 8.0, 9.0};
        RealVector rowVector = MatrixUtils.createRowRealVector(rowData);
        /* write */ matrix.setRowVector(0, rowVector);

        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println(readVector);
    }
}