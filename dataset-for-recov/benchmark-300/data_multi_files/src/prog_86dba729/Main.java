import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addStudentData(1, "Hello");

        Course course = new Course("Computer Science");
        course.addStudent(student);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        // Reading from the ArrayList and LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList Element: " + list.get(i));
        }

        for (String str : linkedList) {
            System.out.println("LinkedList Element: " + str);
        }

        // Reading from the Student's DataManager
        /* read */ String value = student.getStudentData(1);
        System.out.println("Student Data: " + value);

        // Adding more elements to the ArrayList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Printing the updated ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Updated ArrayList Element: " + list.get(i));
        }
    }
}