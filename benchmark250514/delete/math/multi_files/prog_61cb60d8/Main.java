import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        double[] diagonalValues = {1.0, 2.0, 3.0};
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createDiagonalMatrix(diagonalValues);

        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        double[] retrievedDiagonal = matrixReader.retrieveDiagonal();
        System.out.println("Retrieved Diagonal:");
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }

        // Student and course operations
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Enrolled Students in " + course.getEnrolledStudents().size() + " Mathematics:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName() + " (ID: " + student.getStudentId() + ")");
        }
    }
}