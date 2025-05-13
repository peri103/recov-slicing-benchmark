import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(data);
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        System.out.println("Written Vector: " + columnVector);
        System.out.println("Read Vector: " + readColumnVector);
    }
}