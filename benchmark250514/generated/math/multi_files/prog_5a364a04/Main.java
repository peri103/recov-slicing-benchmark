import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix and apply the MatrixVisitor
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0}
        });

        MatrixVisitor visitor = new MatrixVisitor();
        matrix.walkInRowOrder(visitor);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }

        // Read the result of the matrix operation
        /* read */ double result = visitor.end();
        System.out.println("Sum from visitor: " + result);
    }
}