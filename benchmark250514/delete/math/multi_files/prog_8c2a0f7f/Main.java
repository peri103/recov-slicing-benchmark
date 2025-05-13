import org.apache.commons.math3.linear.RealMatrix;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createTriangularMatrix(data);

        // Course operations
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName() + ", Age: " + student.getAge());
        }

        // Retrieve and print the triangular matrix
        /* read */ RealMatrix retrievedMatrix = matrixOps.getTriangularMatrix();
        System.out.println("Retrieved Triangular Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}