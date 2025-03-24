import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Add a score for the student
        student.addScore(85);

        // Perform some unrelated operations
        Random random = new Random();
        int randomValue = random.nextInt(100);
        System.out.println("Random value generated: " + randomValue);

        // Check if the student has the score
        /* read */ boolean hasScore = student.hasScore(85);
        System.out.println("Student has score 85: " + hasScore);

        // Print all enrolled students in the course
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println(enrolledStudent.getName());
        }
    }
}