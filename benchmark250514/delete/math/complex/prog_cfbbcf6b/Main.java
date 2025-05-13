import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to create a sparse real vector
        double[] data = {1.0, 2.0, 3.0};

        // Create another vector for additional operations
        double[] otherData = {4.0, 5.0, 6.0};
        SparseRealVector otherVector = MatrixUtils.createSparseRealVector(otherData);

        // Perform operations on the other vector
        RealVector sumVector = otherVector.mapAdd(10);

        // Use an ArrayList for additional complexity
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < sumVector.getDimension(); i++) {
            arrayList.add(sumVector.getEntry(i));
        }

        /* write */ SparseRealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform operations on the arrayList
        double total = 0;
        for (Double value : arrayList) {
            total += value;
        }
        System.out.println("Sum of elements in the modified vector: " + total);

        // Some unrelated computations
        int[] numbers = {5, 10, 15, 20};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        /* read */ SparseRealVector readVector = MatrixUtils.getSparseRealVector(vector);

        // Print the read vector to verify
        System.out.println(readVector);

        // Additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2);
        System.out.println("Scaled vector: " + scaledVector);
    }
}