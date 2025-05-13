import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a DiagonalMatrixHandler and set a value
        DiagonalMatrixHandler matrixHandler = new DiagonalMatrixHandler(3);
        matrixHandler.setMatrixEntry(1, 5.0);

        // Create a Course and add Students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20, 3.5));
        course.addStudent(new Student("Bob", 22, 3.8));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGpa());
        }

        // Perform operations on a 3x3 matrix
        RealMatrix matrix2 = new Array2DRowRealMatrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.setEntry(i, j, i + j);
            }
        }

        RealMatrix transposedMatrix = matrix2.transpose();
        RealMatrix addedMatrix = matrix2.add(transposedMatrix);

        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the DiagonalMatrixHandler
        /* read */ double value = matrixHandler.getMatrixEntry(1);

        // Print the value to ensure the read method works correctly
        System.out.println("Read value from DiagonalMatrix: " + value);
    }
}