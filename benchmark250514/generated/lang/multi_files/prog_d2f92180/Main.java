import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize and modify string using StrManipulator
        StrManipulator strManipulator = new StrManipulator("Hello World");
        strManipulator.modifyString();

        // Create a course and add students
        Course course = new Course("Computer Science 101");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // More operations with ArrayList and HashMap
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.println("Even number: " + num);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Final read operation and output
        /* read */ String result = strManipulator.getString();
        System.out.println(result);
    }
}