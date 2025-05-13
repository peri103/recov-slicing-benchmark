import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array with some values
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Use the read method to access the ArrayRealVector
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // Print the values to ensure the read method accessed the correct data
        for (double v : readVector.toArray()) {
            System.out.println(v);
        }
    }
}