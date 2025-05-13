import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FruitBag fruitBag = new FruitBag();
        fruitBag.addFruit("apple");

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Print student information
        System.out.println("Student: " + student.getName());
        System.out.println("Courses enrolled: " + student.getCourses());

        // Initialize a HashMap to store some values
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("banana", 2);
        fruitMap.put("orange", 3);

        // Perform some operations with fruitMap
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Insert some dummy logic
        int dummyCounter = 0;
        for (int i = 0; i < 10; i++) {
            dummyCounter += i;
        }
        System.out.println("Dummy Counter: " + dummyCounter);

        /* read */ int appleCount = fruitBag.getFruitCount("apple");

        System.out.println("Count of apples in FruitBag: " + appleCount);
    }
}