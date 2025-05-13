import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20, "Mathematics");
        Student student2 = new Student("Bob", 22, "Physics");

        // Create a course and enroll students
        Course course = new Course("Advanced Programming");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Course: " + student.getCourse());
        }

        // Initialize an ExpiringMapHandler
        ExpiringMapHandler mapHandler = new ExpiringMapHandler(1000);

        // Add an entry to the map
        mapHandler.addEntry(1, "Hello, World!");

        // Perform unrelated computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of numbers: " + sum);

        // Access the entry from the map
        /* read */ String value = mapHandler.getEntry(1);
        System.out.println("Map Entry: " + value);

        // Perform additional operations after the read
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            hashMap.put(i, "Value" + i);
        }
        System.out.println("Final HashMap: " + hashMap);
    }
}