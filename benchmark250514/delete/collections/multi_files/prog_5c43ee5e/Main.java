import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 95);

        Course course = new Course("Mathematics 101");
        course.enrollStudent(student);

        List<Student> students = course.getEnrolledStudents();
        for (Student s : students) {
            if (s.getName().equals("Alice")) {
                /* read */ int mathScore = s.getScore("Math");
                System.out.println("Alice's Math score: " + mathScore);
            }
        }

        // Additional logic for complexity
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}