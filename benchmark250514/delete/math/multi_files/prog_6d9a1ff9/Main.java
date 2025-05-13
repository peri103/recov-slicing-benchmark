import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a Course and add Students
        Course course = new Course("Linear Algebra");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Initialize and use MatrixUtilsWrapper
        MatrixUtilsWrapper matrixWrapper = new MatrixUtilsWrapper();
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        matrixWrapper.createSymmetricMatrix(data);

        // Retrieve and print the symmetric matrix
        /* read */ RealMatrix retrievedMatrix = matrixWrapper.getSymmetricMatrix();
        System.out.println("Retrieved symmetric matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}