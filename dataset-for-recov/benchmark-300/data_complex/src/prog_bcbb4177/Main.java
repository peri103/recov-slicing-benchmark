import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        List<Integer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Adding some elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding some strings to the stringList
        stringList.add("Hello");
        stringList.add("World");

        /* write */ deque.addFirst(42);

        // Processing the list
        for (int num : list) {
            System.out.println("List element: " + num);
        }

        // Processing the stringList
        for (String str : stringList) {
            System.out.println("String list element: " + str);
        }

        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Value from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Adding more elements to the deque
        deque.addLast(100);
        deque.addLast(200);

        // Taking elements from the deque
        try {
            int first = deque.takeFirst();
            int second = deque.takeFirst();
            System.out.println("First element: " + first);
            System.out.println("Second element: " + second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}