import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a university and add students
        University university = new University();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        university.addStudent(student1);
        university.addStudent(student2);

        // Enroll students in courses
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");
        student1.enrollCourse(math);
        student2.enrollCourse(physics);

        // Add grades to courses
        math.addGrade(95.0);
        physics.addGrade(88.0);

        // Create and manipulate a symmetric matrix
        SymmetricMatrixHandler matrixHandler = new SymmetricMatrixHandler(3);
        matrixHandler.setMatrixEntry(1, 1, 5.0);

        // Output student information
        for (Student student : university.getStudents()) {
            System.out.println("Student: " + student.getName());
            for (Course course : student.getCourses()) {
                System.out.println("Course: " + course.getCourseName());
                System.out.println("Grades: " + course.getGrades());
            }
        }

        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrixHandler.getMatrixEntry(1, 1);
        System.out.println("Matrix value at (1,1): " + value);
    }
}