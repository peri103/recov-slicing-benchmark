import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse vector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Perform some unrelated operations
        RealVector anotherVector = new OpenMapRealVector(3);
        anotherVector.setEntry(0, 10.0);
        anotherVector.setEntry(1, 20.0);
        anotherVector.setEntry(2, 30.0);
        
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product: " + dotProduct);

        RealVector sumVector = vector.add(anotherVector);
        System.out.println("Sum vector: " + sumVector);

        // More unrelated operations
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Original vector entry " + i + ": " + vector.getEntry(i));
        }

        // Retrieve the sparse vector using MatrixUtils
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the retrieved vector to verify the operation
        System.out.println("Retrieved vector: " + retrievedVector);

        // Additional complex operations
        double norm = retrievedVector.getNorm();
        System.out.println("Norm of retrieved vector: " + norm);

        OpenMapRealVector scaledVector = retrievedVector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}