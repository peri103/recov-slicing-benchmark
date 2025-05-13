import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        double[] rowData = {10.0, 11.0, 12.0};
        /* write */ matrix.setRowVector(0, MatrixUtils.createRowRealVector(rowData));
        
        /* read */ RealVector vector = matrix.getRowVector(0);
        System.out.println(vector);
    }
}