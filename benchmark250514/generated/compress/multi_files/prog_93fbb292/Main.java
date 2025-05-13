import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarEntryManager jarEntryManager = new JarEntryManager("example.jar");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        jarEntryManager.setExtraData(extraData);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        course.addStudent(student1);
        course.addStudent(student2);

        Map<Integer, String> studentMap = new HashMap<>();
        for (Student student : course.getStudents()) {
            studentMap.put(student.getId(), student.getName());
        }

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Reading the extra data from the JarEntryManager
        /* read */ byte[] readExtraData = jarEntryManager.getExtraData();
        System.out.print("Original extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}