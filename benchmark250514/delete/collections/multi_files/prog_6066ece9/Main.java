import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create a student and add scores
        Student student = new Student("John");
        student.addScore("Algebra", 85);
        student.addScore("Calculus", 90);

        // Enroll student in the course
        course.enrollStudent(student);

        // Retrieve and print student scores
        StaticBucketMap studentScores = student.getScores();
        /* read */ int algebraScore = (Integer) studentScores.get("Algebra");
        System.out.println("Algebra Score for " + student.getName() + ": " + algebraScore);

        // Explore other students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
            StaticBucketMap scores = s.getScores();
            for (Object subject : scores.keySet()) {
                System.out.println(subject + ": " + scores.get(subject));
            }
        }
    }
}