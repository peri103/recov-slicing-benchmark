import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");

        course.addStudent(student);

        /* write */ student.addScore(95);

        for (Student s : course.getStudents()) {
            LinkedList<Integer> scores = s.getScores();
            /* read */ int score = scores.getFirst();
            System.out.println("Student " + s.getName() + " scored: " + score);
        }
    }
}