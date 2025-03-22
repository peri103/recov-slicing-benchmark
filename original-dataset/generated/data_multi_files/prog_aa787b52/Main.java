import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(92);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        List<Student> students = course.getStudents();
        for (Student s : students) {
            List<Integer> scores = s.getScores();
            /* read */ int firstScore = scores.get(0);
            System.out.println("First score for " + s.getName() + ": " + firstScore);
        }
    }
}