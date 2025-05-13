import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});

        // Perform some operations on the vector to make the program more complex
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: ");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        // Create another vector and perform operations
        ArrayRealVector arrayVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(arrayVector);
        System.out.println("Sum Vector: ");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Retrieve the OpenMapRealVector
        /* read */ OpenMapRealVector retrievedVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print out the elements of the retrieved vector
        System.out.println("Retrieved Vector: ");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }

        // Perform additional operations on the retrieved vector
        RealVector negatedVector = retrievedVector.mapMultiply(-1.0);
        System.out.println("Negated Retrieved Vector: ");
        for (int i = 0; i < negatedVector.getDimension(); i++) {
            System.out.println(negatedVector.getEntry(i));
        }
    }
}