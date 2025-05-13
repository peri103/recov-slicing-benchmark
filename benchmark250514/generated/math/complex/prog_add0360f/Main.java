import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        SparseRealVector vector = new OpenMapRealVector(10);
        ArrayRealVector arrayVector = new ArrayRealVector(10);
        
        // Initialize the array vector with some values
        for (int i = 0; i < 10; i++) {
            arrayVector.setEntry(i, i * 2.0);
        }
        
        // Perform some operations on arrayVector
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += arrayVector.getEntry(i);
        }
        System.out.println("Sum of arrayVector: " + sum);
        
        // Use the original SparseRealVector
        /* write */ vector.setEntry(0, 1.0);
        
        // Further operations on vector
        for (int i = 1; i < 10; i++) {
            vector.setEntry(i, i * 3.0);
        }
        
        // Calculate the sum of vector entries
        double vectorSum = 0.0;
        for (int i = 0; i < 10; i++) {
            vectorSum += vector.getEntry(i);
        }
        System.out.println("Sum of vector: " + vectorSum);
        
        // Perform some unrelated operations
        double[] randomArray = new double[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = Math.random() * 100;
        }
        
        double randomSum = 0.0;
        for (double num : randomArray) {
            randomSum += num;
        }
        System.out.println("Sum of randomArray: " + randomSum);
        
        /* read */ double value = vector.getEntry(0);
        System.out.println("Read value: " + value);
    }
}