import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations(data);
        matrixOps.setRowVector(1, new double[]{10.0, 11.0, 12.0});

        // Matrix reader
        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        RealVector modifiedRowVector = matrixReader.getRowVector(1);
        System.out.println("Modified row vector: " + modifiedRowVector);

        // Create a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course students
        System.out.println("Students in course " + course.courseName + ":");
        for (Student student : course.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId());
        }
    }
}