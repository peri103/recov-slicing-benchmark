import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize data to be written
        double[] data = {1.0, 2.0, 3.0};

        // Write operation using MatrixUtils.createArrayRealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Additional complex operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealVector resultVector = matrix.operate(vector);

        System.out.println("Resulting vector after matrix operation:");
        for (double value : resultVector.toArray()) {
            System.out.println(value);
        }

        // Simulate some additional computations
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] * (i + 1);
        }
        System.out.println("Sum of weighted data: " + sum);

        // Generate random numbers and perform some operations
        Random random = new Random();
        double randomSum = 0;
        for (int i = 0; i < 5; i++) {
            double randomValue = random.nextDouble() * 10;
            randomSum += randomValue;
            System.out.println("Random Value " + i + ": " + randomValue);
        }
        System.out.println("Sum of random values: " + randomSum);

        // Read operation using MatrixUtils.getArrayRealVector
        /* read */ double[] readData = vector.toArray();

        // Output the read data
        System.out.println("Original vector data:");
        for (double value : readData) {
            System.out.println(value);
        }
    }
}