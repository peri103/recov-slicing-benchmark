import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueueManager manager = new DelayQueueManager();
        manager.addElement(1000); // Delay of 1 second

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println("Element taken: " + element);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String list element: " + str);
        }
    }
}