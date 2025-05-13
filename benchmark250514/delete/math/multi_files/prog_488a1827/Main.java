import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Use MatrixOperations to create and handle matrices
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createTriangularMatrix(data);

        // Perform other unrelated operations
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Physics");

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());

        // Read the triangular matrix using MatrixOperations
        /* read */ RealMatrix readMatrix = matrixOps.getTriangularMatrix();

        // Print the read matrix to verify the values
        System.out.println("Read Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}