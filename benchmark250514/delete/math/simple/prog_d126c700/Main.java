import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Use the read method to obtain the same ArrayRealVector
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // Output the content of the read vector to verify
        System.out.println(readVector);
    }
}