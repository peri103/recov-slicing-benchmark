import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setMatrixEntry(1, 1, 42.0);

        RealMatrix matrix2 = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        RealMatrix resultMatrix = matrixOps.addMatrix(matrix2);
        RealMatrix multipliedMatrix = matrixOps.multiplyMatrix(matrix2);

        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addGrade(95.0);
        student.addGrade(88.5);
        course.addStudent(student);

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
            System.out.println("Grades: " + s.getGrades());
        }

        double sum = 0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in result matrix: " + sum);

        /* read */ double value = matrixOps.getMatrixEntry(1, 1);
        System.out.println("Value at (1, 1) in original matrix: " + value);

        System.out.println("Result of multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}