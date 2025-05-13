import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a real vector with some data
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an OpenMapRealVector
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(data);

        // Perform some operations on the vector
        vector.setEntry(0, 5.0);  // Change the first element
        vector.addToEntry(1, 2.0); // Add 2.0 to the second element

        // Create another vector using a different constructor
        RealVector anotherVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform vector addition
        RealVector sumVector = vector.add(anotherVector);

        // Output the sum vector values
        System.out.println("Sum vector values:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Use a sparse vector for demonstration
        SparseRealVector sparseVector = new OpenMapRealVector(3);
        sparseVector.setEntry(0, 7.0);
        sparseVector.setEntry(2, 9.0);

        // Multiply sparse vector with a scalar
        RealVector scaledSparseVector = sparseVector.mapMultiply(2.0);

        // Output the scaled sparse vector values
        System.out.println("Scaled sparse vector values:");
        for (int i = 0; i < scaledSparseVector.getDimension(); i++) {
            System.out.println(scaledSparseVector.getEntry(i));
        }

        // Use the read method to retrieve the OpenMapRealVector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Output the values in the vector to verify correctness
        System.out.println("Vector values:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}