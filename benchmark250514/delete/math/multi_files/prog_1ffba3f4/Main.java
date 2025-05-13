import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Perform matrix operations
        MatrixOperations matrixOps = new MatrixOperations(3);

        RealMatrix matrixA = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealMatrix resultMatrix = matrixOps.addMatrix(matrixA);
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();

        // Print the identity matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}