import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager manager = new QueueManager();
        manager.addElement(1000, "Hello, World!");

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        for (String item : linkedList) {
            list.add(item.length());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item " + i + ": " + list.get(i));
        }

        DelayQueue<DelayedElement> queue = manager.getQueue();
        /* read */ DelayedElement element = queue.take();
        System.out.println("Delayed element data: " + element.getData());

        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Another");
        anotherList.add("List");
        anotherList.add("Items");

        for (String item : anotherList) {
            System.out.println("Another list item: " + item);
        }
    }
}