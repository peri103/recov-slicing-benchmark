import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Initialize some values in the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Push a value onto the stack
        student.pushToStack(1);

        // Perform some operations with the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Print the contents of the linkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }

        // Pop the value from the stack
        /* read */ int value = student.popFromStack();
        System.out.println("Stack value: " + value);

        // Add more elements to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Print the contents of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
    }
}