import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        student1.addScore(90);
        student2.addScore(85);

        CopyOnWriteArrayList<Integer> scores = student1.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Alice's score: " + score);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getScores());
        }
    }
}