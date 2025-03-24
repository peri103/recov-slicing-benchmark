import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");
        course.addStudent(student);
        
        student.addScore("Math", 95);
        
        HashMap<String, Integer> scores = student.getScores();
        /* read */ int mathScore = scores.get("Math");
        System.out.println("Alice's Math Score: " + mathScore);
        
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores().keySet().iterator().next() + " - " + s.getScores().values().iterator().next());
        }
    }
}