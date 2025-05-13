import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a MatrixHandler instance
        MatrixHandler matrixHandler = new MatrixHandler();

        // Define dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0, 0, 1},
            {0, 2, 0},
            {3, 0, 0}
        };

        // Create the sparse matrix
        matrixHandler.createSparseMatrix(data, rows, columns);

        // Create a Course and Students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Read the sparse matrix
        /* read */ RealMatrix readMatrix = matrixHandler.getSparseMatrix();

        // Print the read matrix to verify
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}