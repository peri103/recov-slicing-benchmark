import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a diagonal matrix
        MatrixOperations matrixOps = new MatrixOperations();
        double[] diagonalValues = {1.0, 2.0, 3.0};
        matrixOps.createDiagonalMatrix(diagonalValues);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        alice.addGrade(85.0);
        alice.addGrade(90.0);
        course.addStudent(alice);

        Student bob = new Student("Bob");
        bob.addGrade(78.0);
        bob.addGrade(82.0);
        course.addStudent(bob);

        // Print students and their average grades
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Average: " + student.calculateAverage());
        }

        // Extract and print the diagonal of the matrix
        RealMatrix matrix = matrixOps.getMatrix();
        /* read */ double[] extractedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix means to extract the diagonal
        System.out.println("Extracted Diagonal: ");
        for (double value : extractedDiagonal) {
            System.out.print(value + " ");
        }
    }
}