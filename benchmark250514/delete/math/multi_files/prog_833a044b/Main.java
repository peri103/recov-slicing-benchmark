import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createIdentityMatrix(3);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Perform some unrelated operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        });

        RealMatrix sumMatrix = matrixOps.addMatrix(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum of Identity Matrix and Another Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve and print the identity matrix
        /* read */ RealMatrix retrievedMatrix = matrixOps.getMatrix();
        System.out.println("Retrieved Identity Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}