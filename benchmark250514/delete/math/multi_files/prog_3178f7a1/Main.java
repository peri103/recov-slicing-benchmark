import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix wrapper
        SymmetricMatrixWrapper matrixWrapper = new SymmetricMatrixWrapper(3);

        // Set an entry in the symmetric matrix
        matrixWrapper.setMatrixEntry(0, 1, 5.0);

        // Create a course and add students
        Course course = new Course("Advanced Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        course.addStudent(alice);
        course.addStudent(bob);

        // Add grades to students
        alice.addGrade(85.5);
        bob.addGrade(90.0);

        // Process additional matrix operations
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                additionalMatrix.setEntry(i, j, i + j);
            }
        }

        RealMatrix resultMatrix = additionalMatrix.add(additionalMatrix);
        double sum = 0.0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of entries in result matrix: " + sum);

        // Read the value from the symmetric matrix
        /* read */ double matrixValue = matrixWrapper.getMatrixEntry(0, 1);
        System.out.println("Value from symmetric matrix: " + matrixValue);

        // Print student grades
        for (Student student : course.getStudents()) {
            System.out.println("Grades for " + student.getName() + ": " + student.getGrades());
        }
    }
}