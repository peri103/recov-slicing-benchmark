import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryHandler archiveHandler = new ArchiveEntryHandler("initial");
        archiveHandler.updateEntryName("newName");

        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getId());
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        /* read */ String name = archiveHandler.getEntryName();
        System.out.println(name);

        map.put("Three", 3);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}