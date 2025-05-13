import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create an ArrayRealVector using the write method
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Read the ArrayRealVector using the read method
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector.getDataRef());
        
        // Print the elements of the read vector to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}