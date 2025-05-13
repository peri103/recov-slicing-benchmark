import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector with some values
        double[] values = {1.0, 2.0, 3.0};

        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(values);

        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values of the read vector to verify correctness
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}