import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations(10);
        vectorOps.setVectorEntry(0, 3.14);

        Student student = new Student("John Doe", 85.5);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        ArrayRealVector arrayVector = new ArrayRealVector(10);
        for (int i = 0; i < 10; i++) {
            arrayVector.setEntry(i, i * 2.0);
        }

        RealVector scaledVector = arrayVector.mapMultiply(1.5);
        System.out.println("Scaled ArrayRealVector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        /* read */ double value = vectorOps.getVectorEntry(0);
        System.out.println("Read value from OpenMapRealVector: " + value);

        double adjustedValue = value + student.getGrade();
        System.out.println("Adjusted value based on student's grade: " + adjustedValue);
    }
}