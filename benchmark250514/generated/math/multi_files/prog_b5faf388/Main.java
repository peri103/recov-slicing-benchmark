import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        matrixOps.createSymmetricMatrix(data);

        // Perform additional operations
        RealMatrix multipliedMatrix = matrixOps.multiplyWithTranspose();

        // Create Student and Course instances
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics", 3);
        student.enrollCourse(mathCourse);

        // Output student details
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " for " + course.getCreditHours() + " credit hours");
        }

        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = matrixOps.getSymmetricMatrix();

        // Print the matrix to verify
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}