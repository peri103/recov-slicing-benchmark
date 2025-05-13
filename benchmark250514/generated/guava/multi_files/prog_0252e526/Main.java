import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("Bob", course);
        student.enroll("A");

        // Additional unrelated data structures and operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("item1", 5);
        hashMap.put("item2", 15);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("element1");
        hashSet.add("element2");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (String element : hashSet) {
            System.out.println("HashSet Element: " + element);
        }

        // Retrieve and print the student's grades
        /* read */ String grade = student.getGrades().iterator().next();
        System.out.println("Student's Grade: " + grade);
    }
}