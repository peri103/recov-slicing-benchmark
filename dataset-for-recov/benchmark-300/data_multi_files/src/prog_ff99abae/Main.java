import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        course.addStudent(student);
        student.storeScore(95);

        Vector<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Student's score: " + score);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.storeScore(88);

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores().get(0));
        }
    }
}