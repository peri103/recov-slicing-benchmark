import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {0.0, 4.0, 5.0},
            {0.0, 0.0, 6.0}
        };

        // Create a MatrixOperations object
        MatrixOperations matrixOps = new MatrixOperations(data);

        // Create a student and courses
        Student student = new Student("Alice");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Add grades to courses
        math.addGrade(95.0);
        science.addGrade(88.5);

        // Add courses to student
        student.addCourse(math);
        student.addCourse(science);

        // Retrieve the triangular matrix
        /* read */ RealMatrix retrievedMatrix = matrixOps.getTriangularMatrix();

        // Print the retrieved triangular matrix
        System.out.println("Retrieved triangular matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Display student information
        System.out.println("Student Name: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Grades: " + course.getGrades());
        }
    }
}