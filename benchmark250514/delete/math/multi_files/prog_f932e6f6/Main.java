import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations(5);
        vectorOps.writeValue(0, 1.0);

        OpenMapRealVector anotherVector = new OpenMapRealVector(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            anotherVector.setEntry(i, random.nextDouble() * 100);
        }

        ComplexCalculations calculations = new ComplexCalculations();
        RealVector sumVector = calculations.addVectors(vectorOps.getVector(), anotherVector);
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println("Sum vector entry " + i + ": " + sumVector.getEntry(i));
        }

        RealVector scaledVector = calculations.scaleVector(sumVector, 2.0);
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Scaled vector entry " + i + ": " + scaledVector.getEntry(i));
        }

        double value = /* read */ vectorOps.getVector().getEntry(0);
        System.out.println("Original vector entry 0: " + value);

        OpenMapRealVector differenceVector = calculations.subtractVectors(anotherVector, vectorOps.getVector());
        for (int i = 0; i < differenceVector.getDimension(); i++) {
            System.out.println("Difference vector entry " + i + ": " + differenceVector.getEntry(i));
        }
    }
}