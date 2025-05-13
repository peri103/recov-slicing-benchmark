import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollCourse("Math101");
        student.enrollCourse("Physics101");

        StudentCourses courses = student.getCourses();
        Set<String> mathStatus = courses.getCourseStatus("Math101");

        for (String status : mathStatus) {
            System.out.println("Course Math101 status: " + status);
        }

        Set<String> physicsStatus = courses.getCourseStatus("Physics101");
        for (String status : physicsStatus) {
            System.out.println("Course Physics101 status: " + status);
        }
    }
}