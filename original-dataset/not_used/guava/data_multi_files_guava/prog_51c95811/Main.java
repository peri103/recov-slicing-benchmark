import com.google.common.collect.TreeMultimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");

        /* write */ multimap.put("key1", 10);
        
        // Adding a student and their score
        student.addScore(95);
        course.addStudent(student);
        
        // Displaying student scores
        for (Integer score : student.getScores()) {
            System.out.println("Student Score: " + score);
        }
        
        /* read */ Collection<Integer> values = multimap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }
        
        // Displaying students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student in Course: " + s.getScores());
        }
    }
}