import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ SparseRealVector vector = (SparseRealVector) MatrixUtils.createSparseRealVector(data);
        
        /* read */ RealVector readVector = vector;
        
        System.out.println("Vector: " + readVector);
    }
}