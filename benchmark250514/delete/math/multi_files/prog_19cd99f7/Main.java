import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a student and enroll in courses
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics");
        student.enrollCourse(mathCourse);

        // Set matrix data for the course
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 1.0, 0.0},
            {3.0, 2.0, 1.0}
        };
        mathCourse.setCourseMatrix(data);

        // Retrieve and print the matrix from the course
        RealMatrix matrix = mathCourse.getCourseMatrix();
        /* read */ System.out.println("Course Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}