import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");
        course.addStudent(student);

        student.addScore(95);
        Vector<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Alice's score: " + score);

        // Add more students and scores
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addScore(88);

        // Print all students and their scores
        for (Student s : course.getStudents()) {
            System.out.println(s.getName() + "'s scores: " + s.getScores());
        }
    }
}