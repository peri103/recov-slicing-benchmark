import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        double[] initialData = {1.0, 2.0, 3.0};
        VectorOperations vectorOps = new VectorOperations(initialData);
        
        vectorOps.modifyVector();

        ComplexOperations complexOps = new ComplexOperations();
        RealVector sumVector = complexOps.addVectors(vectorOps.getVector(), new double[]{4.0, 5.0, 6.0});

        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        int[] numbers = {7, 8, 9, 10};
        int sum = complexOps.sumArray(numbers);
        System.out.println("Sum of numbers: " + sum);

        /* read */ OpenMapRealVector retrievedVector = vectorOps.getVector();
        
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
        
        retrievedVector.mapMultiplyToSelf(2.0);

        System.out.println("Modified Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}