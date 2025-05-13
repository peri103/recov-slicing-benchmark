import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CustomMap instance and perform write operation
        CustomMap customMap = new CustomMap();
        customMap.putValue("key", "value");

        // Create a Student instance and add course scores
        Student student = new Student("John Doe");
        student.addCourseScore("Math", 95);
        student.addCourseScore("Science", 88);

        // Retrieve and print course scores
        System.out.println(student.getName() + "'s Math score: " + student.getCourseScore("Math"));
        System.out.println(student.getName() + "'s Science score: " + student.getCourseScore("Science"));

        // Perform unrelated operations
        Map<String, Integer> numberMap = Map.of("one", 1, "two", 2, "three", 3);
        int total = numberMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total of numbers: " + total);

        // Perform read operation from CustomMap
        /* read */ String retrievedValue = customMap.getValue("key");
        System.out.println("Retrieved value from CustomMap: " + retrievedValue);
    }
}