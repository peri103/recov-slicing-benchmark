import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        course.addStudent(student);
        student.addScore(95);

        Vector<Integer> scores = student.getScores();
        /* read */ int score = scores.elementAt(0);
        System.out.println("Student's score: " + score);

        // Additional operations
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addScore(85);

        for (Student s : course.getStudents()) {
            Vector<Integer> studentScores = s.getScores();
            for (int i = 0; i < studentScores.size(); i++) {
                System.out.println(s + " scored " + studentScores.elementAt(i));
            }
        }
    }
}