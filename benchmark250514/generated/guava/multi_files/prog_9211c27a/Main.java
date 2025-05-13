import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(92);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        registry.registerStudent(student);

        // Perform operations on the course
        for (Student enrolledStudent : course.getStudents()) {
            System.out.println("Student: " + enrolledStudent.getName());
            List<Integer> grades = enrolledStudent.getGrades();
            for (int grade : grades) {
                System.out.println("Grade: " + grade);
            }
        }

        // Retrieve the registered student
        Student registeredStudent = registry.getRegisteredStudent();
        System.out.println("Retrieved Student: " + registeredStudent.getName());
        List<Integer> registeredGrades = registeredStudent.getGrades();
        for (int grade : registeredGrades) {
            System.out.println("Registered Grade: " + grade);
        }
    }
}