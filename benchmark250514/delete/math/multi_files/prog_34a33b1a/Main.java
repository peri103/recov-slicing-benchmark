import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] initialData = {1.0, 2.0, 3.0};
        Student student = new Student("Bob", initialData);

        ArrayRealVector unrelatedVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = student.addVectors(unrelatedVector);
        System.out.println("Sum Vector: " + sumVector);

        double dotProduct = student.calculateDotProduct(unrelatedVector);
        System.out.println("Dot Product: " + dotProduct);

        // Read the OpenMapRealVector using the read method
        /* read */ OpenMapRealVector readVector = student.getStudentVector();

        // Print the vector to verify the correct value is read
        System.out.println("Read Vector: " + readVector);

        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector combinedVector = anotherVector.add(readVector);
        System.out.println("Combined Vector: " + combinedVector);
    }
}