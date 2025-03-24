import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);
        
        // Additional complex code
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }
        
        // Thread to write data
        Thread writerThread = new Thread(writer::writeData);
        
        // Thread to read data
        Thread readerThread = new Thread(reader::readData);
        
        // Start the threads
        writerThread.start();
        readerThread.start();
        
        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // More complex code
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList value: " + list.get(i));
        }
        
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList value: " + linkedList.get(i));
        }
    }
}