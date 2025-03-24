import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        try {
            /* write */ queue.put(1);

            // Adding elements to the ArrayList
            list.add(10);
            list.add(20);
            list.add(30);

            // Adding elements to the LinkedList
            linkedList.add(100);
            linkedList.add(200);
            linkedList.add(300);

            // Processing ArrayList and LinkedList
            for (Integer num : list) {
                linkedList.add(num);
            }

            // Printing elements from the LinkedList
            for (Integer num : linkedList) {
                System.out.println(num);
            }

            /* read */ int value = queue.take();
            System.out.println("Value from SynchronousQueue: " + value);

            // More complex operations
            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                newList.add(i * 10);
            }

            for (Integer num : newList) {
                linkedList.add(num);
            }

            for (Integer num : linkedList) {
                System.out.println("Processed LinkedList: " + num);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}