import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix operation instance
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        matrixOps.createMatrix(data);

        // Perform some operations with students and courses
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        System.out.println("Enrolled students in " + mathCourse.getEnrolledStudents());

        // Retrieve the matrix
        /* read */ RealMatrix retrievedMatrix = matrixOps.getMatrix();

        // Output the retrieved matrix
        System.out.println("Retrieved matrix: ");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}