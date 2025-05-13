import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a student and enroll in a course
        Student student = new Student("John");
        Course mathCourse = new Course("Mathematics");

        // Set a triangular matrix for the course
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };
        mathCourse.setTriangularMatrix(data);

        // Enroll the student in the course
        student.enrollCourse(mathCourse);

        // Retrieve and print the triangular matrix from the course
        /* read */ RealMatrix readMatrix = mathCourse.getTriangularMatrix();
        System.out.println("Triangular Matrix for " + mathCourse.getCourseName() + ":");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}