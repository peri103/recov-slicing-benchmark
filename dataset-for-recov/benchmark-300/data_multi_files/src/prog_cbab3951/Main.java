import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000, "Delayed Data");
        
        queueManager.addElement(element);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("First Element");
        list.add("Second Element");
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        
        for (String str : list) {
            System.out.println(str);
        }
        
        for (Integer num : linkedList) {
            System.out.println(num);
        }
        
        DelayQueue<DelayedElement> queue = queueManager.getQueue();
        /* read */ DelayedElement takenElement = queue.take();
        
        System.out.println(takenElement.getData());
    }
}