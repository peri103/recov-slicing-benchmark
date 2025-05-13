import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 1);
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        matrix.setColumnVector(0, columnVector);
        
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        System.out.println(readVector);
    }
}