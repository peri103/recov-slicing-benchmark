import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};

        // Additional code to make the program more complex
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector additionalVector = new ArrayRealVector(additionalData);
        RealVector sumVector = additionalVector.mapAdd(10); // Add 10 to each element
        System.out.println("Additional Vector: " + additionalVector);
        System.out.println("Sum Vector: " + sumVector);

        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // More operations
        RealVector scaledVector = vector.mapMultiply(2); // Scale the vector by 2
        System.out.println("Scaled Vector: " + scaledVector);

        // Some unrelated operations
        double[] unrelatedData = {7.0, 8.0, 9.0};
        RealVector unrelatedVector = new ArrayRealVector(unrelatedData);
        RealVector diffVector = unrelatedVector.mapSubtract(3); // Subtract 3 from each element
        System.out.println("Unrelated Vector: " + unrelatedVector);
        System.out.println("Diff Vector: " + diffVector);

        /* read */ RealVector readVector = vector; // Assuming getSparseRealVector is equivalent to accessing the vector directly
        
        System.out.println("Vector: " + readVector);
    }
}