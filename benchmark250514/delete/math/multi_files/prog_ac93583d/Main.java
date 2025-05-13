import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        MatrixOperations matrixOps = new MatrixOperations(data);

        double[] newRowData = {7.0, 8.0, 9.0};
        matrixOps.modifyRow(0, newRowData);

        // Create a course and add students
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        System.out.println("Course details: " + mathCourse);

        // Perform matrix operations
        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        RealMatrix scaledMatrix = matrixOps.scalarMultiply(2.0);

        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Access the modified row vector
        /* read */ RealVector readVector = matrixOps.getRowVector(0);
        System.out.println("Modified row vector: " + readVector);
    }
}