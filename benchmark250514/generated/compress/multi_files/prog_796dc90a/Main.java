import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize ZipEntryManager
        ZipEntryManager zipManager = new ZipEntryManager("example.txt");

        // Setting extra data
        byte[] extraData = {0x05, 0x06, 0x07, 0x08};
        zipManager.setExtraData(extraData);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Perform some unrelated operations
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Pencil", 10);
        inventory.put("Notebook", 5);

        for (Map.Entry<String, Integer> item : inventory.entrySet()) {
            System.out.println("Item: " + item.getKey() + ", Quantity: " + item.getValue());
        }

        // Retrieve and display extra data
        /* read */ byte[] retrievedData = zipManager.getExtraData();

        for (byte b : retrievedData) {
            System.out.printf("0x%02X ", b);
        }
        System.out.println();
    }
}