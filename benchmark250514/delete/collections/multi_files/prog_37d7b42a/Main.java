import java.util.List;
import org.apache.commons.collections4.map.PredicatedMap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(1, "85");
        student2.addScore(1, "90");

        course.addStudent(student1);
        course.addStudent(student2);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            PredicatedMap<Object, Object> scores = student.getScores().getScoreMap();
            /* read */ Object score = scores.get(1);
            System.out.println("Test 1 Score: " + score);
        }
    }
}