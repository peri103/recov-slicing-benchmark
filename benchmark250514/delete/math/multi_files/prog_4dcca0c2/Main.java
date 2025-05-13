import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a MatrixOperations object
        MatrixOperations matrixOps = new MatrixOperations(3);

        // Create and enroll a student in a course
        Student student = new Student("Alice");
        student.enrollInCourse("Linear Algebra");

        // Display student information
        student.displayStudentInfo();

        // Read the matrix to verify it is the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();

        // Display the matrix to verify its identity
        System.out.println("Read identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}