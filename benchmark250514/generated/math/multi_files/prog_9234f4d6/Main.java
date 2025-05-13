import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a matrix visitor and simulate a matrix visit
        MatrixVisitor visitor = new MatrixVisitor();
        visitor.start(3, 3, 0, 2, 0, 2);
        visitor.visit(0, 0, 1.0);
        visitor.visit(0, 1, 2.0);
        visitor.visit(0, 2, 3.0);
        visitor.visit(1, 0, 4.0);
        visitor.visit(1, 1, 5.0);
        visitor.visit(1, 2, 6.0);
        visitor.visit(2, 0, 7.0);
        visitor.visit(2, 1, 8.0);
        visitor.visit(2, 2, 9.0);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        course.addStudent(student1);
        course.addStudent(student2);

        // Print student names
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
        }

        // Use the read method from MatrixVisitor
        double matrixSum = visitor.end(); // Read operation
        System.out.println("Sum of matrix elements: " + matrixSum);
    }
}