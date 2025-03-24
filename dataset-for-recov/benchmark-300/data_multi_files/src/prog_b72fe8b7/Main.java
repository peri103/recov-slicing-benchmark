import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.addScore(95);
        ConcurrentLinkedDeque<Integer> scores = student.getScores();
        /* read */ Integer score = scores.peekFirst();
        System.out.println("Alice's score: " + score);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addScore(85);

        // Printing all students and their scores
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores().peekFirst());
        }
    }
}