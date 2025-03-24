import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Adding a score to the student
        student.addScore(95);

        // Adding the student to the course
        course.addStudent(student);

        // Retrieving the student's scores
        HashSet<Integer> scores = student.getScores();
        /* read */ boolean containsScore = scores.contains(95);
        System.out.println("Student's scores contain 95: " + containsScore);

        // Printing all students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student in course: " + s);
        }
    }
}