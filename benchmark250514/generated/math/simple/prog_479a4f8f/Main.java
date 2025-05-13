import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data to be written
        double[] data = {1.0, 2.0, 3.0};

        // Write operation using MatrixUtils.createArrayRealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Read operation using MatrixUtils.getArrayRealVector
        /* read */ double[] readData = vector.toArray();

        // Output the read data
        for (double value : readData) {
            System.out.println(value);
        }
    }
}