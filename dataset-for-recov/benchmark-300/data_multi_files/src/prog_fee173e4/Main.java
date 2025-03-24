import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Computer Science");
        course.addStudent(student);

        student.addScore(95);

        Vector<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Score: " + score);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addScore(85);

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores().get(0));
        }
    }
}