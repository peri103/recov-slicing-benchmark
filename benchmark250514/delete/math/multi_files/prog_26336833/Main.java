import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create a student and add some grades
        Student student = new Student("John Doe");
        student.addGrade(88.5);
        student.addGrade(92.0);
        student.addGrade(79.5);

        // Print student information
        System.out.println("Student: " + student.getName());
        System.out.println("Grades: " + student.getGrades());

        // Create a matrix operation instance
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setMatrixEntry(1, 1, 5.5);

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // More matrix operations
        SparseRealMatrix matrix = matrixOps.getMatrix();
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(2, 2, 9.0);

        // Print the sparse matrix
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Value at (1,1): " + value);

        // Additional logic to make the program more complex
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RealMatrix realMatrix = MatrixUtils.createRealMatrix(data);
        RealMatrix resultMatrix = realMatrix.multiply(MatrixUtils.createRealIdentityMatrix(3));

        // Print the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}