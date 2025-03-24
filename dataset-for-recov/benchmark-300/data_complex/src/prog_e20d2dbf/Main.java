import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> stringList = new LinkedList<>();

        // Adding some unrelated operations
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }

        /* write */ deque.addFirst(42);

        // More unrelated operations
        list.add(10);
        list.add(20);
        list.add(30);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        /* read */ int value = deque.getFirst();
        System.out.println("Value from deque: " + value);

        // Even more unrelated operations
        Deque<Integer> anotherDeque = new LinkedList<>();
        anotherDeque.addLast(100);
        anotherDeque.addLast(200);
        System.out.println("Another deque elements: " + anotherDeque);
    }
}