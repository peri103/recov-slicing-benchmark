import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createIdentityMatrix(3);

        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });

        RealMatrix addedMatrix = matrixOps.addMatrix(anotherMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Student operations
        Student student = new Student("John Doe");
        student.addGrade(85.5);
        student.addGrade(92.0);
        student.addGrade(76.5);

        System.out.println("Student: " + student.getName());
        System.out.println("Average Grade: " + student.calculateAverage());

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();
        System.out.println("Identity Matrix: " + readMatrix);
    }
}