import com.google.common.collect.ArrayListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        /* write */ multimap.put("key1", 100);
        
        // Creating a course and adding students
        Course course = new Course("Mathematics");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        
        // Display enrolled students
        for (String student : course.getStudents()) {
            System.out.println("Enrolled: " + student);
        }

        // Creating a student and adding scores
        Student student = new Student("Alice");
        student.addScore(90);
        student.addScore(85);
        
        // Displaying scores
        List<Integer> scores = student.getScores();
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        /* read */ List<Integer> values = multimap.get("key1");
        System.out.println("Value from multimap: " + values.get(0));
    }
}