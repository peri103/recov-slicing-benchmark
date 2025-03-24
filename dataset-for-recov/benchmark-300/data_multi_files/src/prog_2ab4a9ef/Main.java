import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addValueToStack(1);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Initialize some data
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Perform some operations
        for (int i = 0; i < list.size(); i++) {
            student.addValueToStack(list.get(i));
        }

        for (int i = 0; i < linkedList.size(); i++) {
            student.addValueToStack(linkedList.get(i));
        }

        // Some unrelated code
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of list elements: " + sum);

        /* read */ int value = student.getValueFromStack();
        System.out.println("Value read from stack: " + value);

        // More unrelated code
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(i * 5);
        }

        for (int i = 0; i < newList.size(); i++) {
            student.addValueToStack(newList.get(i));
        }

        System.out.println("Final stack size: " + newList.size());
    }
}