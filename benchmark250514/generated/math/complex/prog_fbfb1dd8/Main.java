import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        SparseRealVector vector = new OpenMapRealVector(10);
        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});

        /* write */ vector.setEntry(0, 3.14);

        // Perform some operations on another vector
        anotherVector.mapMultiplyToSelf(2.0);
        double sum = anotherVector.getL1Norm();
        System.out.println("Sum of elements in anotherVector: " + sum);

        // Perform some calculations
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product of vector and anotherVector: " + dotProduct);

        // More operations on anotherVector
        anotherVector.setEntry(2, 10.0);
        double entryValue = anotherVector.getEntry(2);
        System.out.println("Modified entry in anotherVector: " + entryValue);

        // Final read operation
        /* read */ double value = vector.getEntry(0);
        System.out.println("Value from vector: " + value);
    }
}