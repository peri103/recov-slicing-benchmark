import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        DelayedElement element = new DelayedElement(1000, "Test Data");
        
        manager.addElement(element);
        
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        list.add("First Element");
        linkedList.add(100);
        
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 10);
        }
        
        for (String item : list) {
            System.out.println(item);
        }
        
        for (Integer value : linkedList) {
            System.out.println(value);
        }
        
        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println(takenElement.getData());
    }
}