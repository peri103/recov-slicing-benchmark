import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        MatrixOperations matrixOps = new MatrixOperations(matrixData);
        RealVector columnVector = new ArrayRealVector(new double[]{10.0, 11.0, 12.0});
        
        matrixOps.setColumnVector(0, columnVector);
        
        // Create a student and add grades
        Student student = new Student("John Doe");
        student.addGrade(85.5);
        student.addGrade(90.0);
        student.addGrade(92.5);
        
        System.out.println("Student: " + student.getName());
        System.out.println("Grades: " + student.getGrades());
        
        // Perform some unrelated calculations
        RealVector modifiedVector = columnVector.mapAdd(5.0);
        System.out.println("Modified Vector:");
        for (int i = 0; i < modifiedVector.getDimension(); i++) {
            System.out.println(modifiedVector.getEntry(i));
        }
        
        // Read the modified column vector
        /* read */ RealVector readColumnVector = matrixOps.getColumnVector(0);
        
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}