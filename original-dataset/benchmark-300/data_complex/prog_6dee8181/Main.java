import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }
        
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }
        
        try {
            // Perform the read operation in the main thread
            /* read */ int value = queue.take();
            System.out.println("Value from SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // More additional code
        ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();
        nestedList.add(list);
        nestedList.add(new ArrayList<>(linkedList));
        
        for (ArrayList<Integer> innerList : nestedList) {
            for (int num : innerList) {
                System.out.println("Nested List value: " + num);
            }
        }
    }
}