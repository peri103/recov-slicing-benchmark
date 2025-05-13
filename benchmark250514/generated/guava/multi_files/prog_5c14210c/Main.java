import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollInCourse(1, 10, "Math");
        student.enrollInCourse(20, 30, "Science");

        // Unrelated operations
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Key1", 100);
        sampleMap.put("Key2", 200);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in sampleMap: " + sum);

        // Original read operation
        /* read */ String course = student.getCourse(5);
        System.out.println("Course on day 5: " + course);

        // Further unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total sum of numbers array: " + total);
    }
}