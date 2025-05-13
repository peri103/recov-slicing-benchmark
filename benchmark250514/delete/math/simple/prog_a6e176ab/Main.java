import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RealVector vector = MatrixUtils.createRowRealVector(data[0]);
        
        /* write */ matrix.setRowVector(0, vector);
        
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println(readVector);
    }
}