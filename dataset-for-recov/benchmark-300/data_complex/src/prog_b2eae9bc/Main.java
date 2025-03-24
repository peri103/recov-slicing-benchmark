import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Start a new thread to perform the write operation
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
            /* read */ int value = queue.take();
            System.out.println("Value from SynchronousQueue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // More complex operations
        ArrayList<LinkedList<Integer>> complexList = new ArrayList<>();
        complexList.add(linkedList);
        
        for (LinkedList<Integer> ll : complexList) {
            for (int val : ll) {
                System.out.println("Complex List value: " + val);
            }
        }
    }
}