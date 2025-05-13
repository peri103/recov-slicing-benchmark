import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        OpenMapRealVector vector = new OpenMapRealVector(10);
        ArrayRealVector arrayVector = new ArrayRealVector(10);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double randomValue = random.nextDouble() * 100;
            arrayVector.setEntry(i, randomValue);
            System.out.println("ArrayRealVector entry " + i + ": " + arrayVector.getEntry(i));
        }
        
        /* write */ vector.setEntry(0, 3.14);

        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arrayVector.getEntry(i);
        }
        System.out.println("Sum of ArrayRealVector: " + sum);

        double average = sum / arrayVector.getDimension();
        System.out.println("Average of ArrayRealVector: " + average);

        /* read */ double value = vector.getEntry(0);
        System.out.println("OpenMapRealVector entry 0: " + value);

        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            double entryValue = arrayVector.getEntry(i);
            if (entryValue > maxValue) {
                maxValue = entryValue;
            }
        }
        System.out.println("Max value in ArrayRealVector: " + maxValue);
    }
}