import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");

        // Add student to the course
        course.addStudent(student);

        // Store a grade for the student
        student.storeGrade(95);

        // Retrieve the grades
        Vector grades = student.getGrades();
        /* read */ int grade = (Integer) grades.elementAt(0);
        System.out.println("Alice's grade: " + grade);

        // Print all students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student in course: " + s);
        }
    }
}