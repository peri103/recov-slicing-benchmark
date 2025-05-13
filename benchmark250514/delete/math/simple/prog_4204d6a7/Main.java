import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        /* read */ double[] retrievedData = vector.toArray();
        
        for (double value : retrievedData) {
            System.out.println(value);
        }
    }
}