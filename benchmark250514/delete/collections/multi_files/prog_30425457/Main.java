import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;

        Map<String, Integer> baseMap = new HashMap<>();
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        // Create a course and students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(95);
        bob.addScore(85);

        // Add students to the course
        course.addStudent(alice);
        course.addStudent(bob);

        // Add a value to the predicated map
        predicatedMap.put("key", 42);

        // Retrieve and print student scores
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s scores: " + student.getScores());
        }

        // Retrieve and print the value from the predicated map
        /* read */ int value = predicatedMap.get("key");
        System.out.println("Value from predicatedMap: " + value);
    }
}