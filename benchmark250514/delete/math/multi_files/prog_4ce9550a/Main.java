import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize course and matrix data
        Course algebraCourse = new Course("Algebra");
        double[][] matrixData = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        // Set the symmetric matrix for the course
        algebraCourse.initializeMatrix(matrixData);

        // Perform additional operations
        double[][] additionalData = {
            {7, 8, 9},
            {8, 10, 11},
            {9, 11, 12}
        };

        // Create another matrix
        RealMatrix anotherMatrix = MatrixUtils.createSymmetricMatrix(additionalData);
        RealMatrix courseMatrix = algebraCourse.getCourseMatrix();

        // Multiply matrices
        RealMatrix multipliedMatrix = courseMatrix.multiply(anotherMatrix);

        // Calculate and print trace of the multiplied matrix
        double trace = multipliedMatrix.getTrace();
        System.out.println("Trace of the multiplied matrix: " + trace);

        // Retrieve and print the symmetric matrix from the course
        /* read */ RealMatrix retrievedMatrix = algebraCourse.getCourseMatrix();
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}