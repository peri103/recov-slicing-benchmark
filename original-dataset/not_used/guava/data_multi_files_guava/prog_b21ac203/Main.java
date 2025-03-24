import java.util.List;

public class Main {
    public static void main(String[] args) {
        AtomicDoubleManager atomicDoubleManager = new AtomicDoubleManager();
        Student student = new Student("Alice");
        student.addScore(90);
        
        // Adding a score to the atomic double manager
        atomicDoubleManager.addValue(5.0);
        
        // Creating a course and adding a student
        Course course = new Course("Mathematics");
        course.addStudent(student);

        /* read */ double value = atomicDoubleManager.getValue();
        List<Integer> scores = student.getScores();
        System.out.println("Value after write: " + value);
        System.out.println("Student: " + student.name + ", Score: " + scores.get(0));
    }
}