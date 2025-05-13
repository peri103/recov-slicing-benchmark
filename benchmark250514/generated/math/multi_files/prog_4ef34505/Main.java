import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations(3);

        vectorOps.setVectorEntry(1, 10.0);
        vectorOps.setVectorEntry(2, 20.0);

        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = vectorOps.addVector(anotherVector);

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        vectorOps.setVectorEntry(0, 42.0);

        Student student = new Student("John");
        student.addGrade(85.0);
        student.addGrade(92.0);
        student.addGrade(78.0);

        System.out.println("Student Grades:");
        for (double grade : student.getGrades()) {
            System.out.println(grade);
        }

        System.out.println("Average Grade: " + student.calculateAverageGrade());

        /* read */ double value = vectorOps.getVectorEntry(0);
        System.out.println("Read value: " + value);
    }
}