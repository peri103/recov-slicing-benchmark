import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations with a 3x3 identity matrix
        MatrixOperations matrixOps = new MatrixOperations(3);

        // Create a 3x3 matrix with some values
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);

        // Perform matrix addition
        RealMatrix resultMatrix = matrixOps.addMatrix(matrix);

        // Print the resulting matrix
        System.out.println("Resulting Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrixOps.multiplyMatrix(matrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using the read method
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix subtraction
        RealMatrix subtractedMatrix = matrixOps.subtractMatrix(matrix);

        // Print the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print students in the course
        System.out.println("Students in the course:");
        for (Student student : course.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}