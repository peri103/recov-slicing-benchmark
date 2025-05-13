import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CustomReferenceMap instance and use it
        CustomReferenceMap customMap = new CustomReferenceMap();
        customMap.putValue("key", 42);

        // Create a Course and add Students to it
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println("Course: " + course.courseName);
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Additional unrelated code to make the program more complex
        Map<String, String> additionalMap = new HashMap<>();
        additionalMap.put("A", "Apple");
        additionalMap.put("B", "Banana");

        String fruit = additionalMap.get("A");
        System.out.println("Fruit from additionalMap: " + fruit);

        // Read the value from the CustomReferenceMap
        /* read */ Integer value = customMap.getValue("key");
        System.out.println("Value from CustomReferenceMap: " + value);
    }
}