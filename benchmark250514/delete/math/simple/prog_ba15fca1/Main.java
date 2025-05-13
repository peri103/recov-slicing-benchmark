import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);
        
        /* read */ RealVector readVector = vector; // Assuming getArrayRealVector is a method to retrieve the vector itself
        System.out.println(readVector);
    }
}