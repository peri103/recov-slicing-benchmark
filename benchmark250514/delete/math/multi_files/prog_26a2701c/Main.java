import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        int rows = 2;
        int columns = 2;
        double[][] data = {
            {1.0, 0.0},
            {0.0, 1.0}
        };

        // Handle matrix operations
        MatrixHandler matrixHandler = new MatrixHandler();
        matrixHandler.createSparseMatrix(rows, columns, data);

        // Create a course and add students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addGrade(95.0);
        bob.addGrade(88.0);

        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Output student grades
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Grades for " + student.getGrades());
        }

        // Retrieve the sparse matrix
        /* read */ RealMatrix retrievedMatrix = matrixHandler.getSparseMatrix();

        // Print the retrieved sparse matrix to verify
        System.out.println("Retrieved sparse matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}