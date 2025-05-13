import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create another vector for operations
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector additionalVector = MatrixUtils.createArrayRealVector(additionalData);

        // Perform some operations on additionalVector
        RealVector scaledVector = additionalVector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (double value : scaledVector.toArray()) {
            System.out.println(value);
        }

        // Create a matrix using the original vector data
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{data, additionalData});
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform a write operation using the original data
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);

        // Manipulate the vector before reading
        RealVector addedVector = vector.add(additionalVector);
        System.out.println("Added Vector:");
        for (double value : addedVector.toArray()) {
            System.out.println(value);
        }

        // Read the original data
        /* read */ double[] readData = vector.toArray();

        System.out.println("Original Vector:");
        for (double value : readData) {
            System.out.println(value);
        }

        // Perform some more operations on the read data
        double sum = 0;
        for (double value : readData) {
            sum += value;
        }
        System.out.println("Sum of original vector: " + sum);
    }
}