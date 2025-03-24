import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.writeData(42);

        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        int value = processor.readData();
        System.out.println("Value read from queue: " + value);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }
    }
}