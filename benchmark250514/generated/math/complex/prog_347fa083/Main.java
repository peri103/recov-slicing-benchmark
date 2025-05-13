import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayRealVector vector = new ArrayRealVector(1);
        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform some operations on anotherVector
        double sum = Arrays.stream(anotherVector.toArray()).sum();
        System.out.println("Sum of elements in anotherVector: " + sum);

        // Create a new ArrayRealVector and perform operations
        ArrayRealVector vector2 = new ArrayRealVector(new double[]{5.0, 6.0, 7.0});
        vector2.mapAddToSelf(2.0);
        System.out.println("Elements of vector2 after adding 2.0 to each: " + Arrays.toString(vector2.toArray()));

        /* write */ vector.setEntry(0, 2.5);
        
        // Perform operations on vector2
        double dotProduct = vector2.dotProduct(anotherVector);
        System.out.println("Dot product of vector2 and anotherVector: " + dotProduct);

        // More operations on anotherVector
        anotherVector.mapMultiplyToSelf(3.0);
        System.out.println("Elements of anotherVector after multiplying by 3.0: " + Arrays.toString(anotherVector.toArray()));

        /* read */ double value = vector.getEntry(0);
        System.out.println("Value from vector: " + value);

        // Final operations
        ArrayRealVector finalVector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});
        finalVector.mapDivideToSelf(2.0);
        System.out.println("Elements of finalVector after dividing by 2.0: " + Arrays.toString(finalVector.toArray()));
    }
}