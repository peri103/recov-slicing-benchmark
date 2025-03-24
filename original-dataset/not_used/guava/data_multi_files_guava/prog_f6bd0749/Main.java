import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        /* write */ builder.put("key1", 42);
        ImmutableListMultimap<String, Integer> multimap = builder.build();

        // Create Course and Students
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addScore(95);
        course.addStudent(student);

        // Read the score
        int score = student.getScores().get(0);
        System.out.println("Student: " + student.name + ", Score: " + score);

        /* read */ Integer value = multimap.get("key1").iterator().next();
        System.out.println("Value from multimap: " + value);
    }
}