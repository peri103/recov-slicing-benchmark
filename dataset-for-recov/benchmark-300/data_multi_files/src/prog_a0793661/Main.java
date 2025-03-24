import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        ArrayList<DelayedElement> list = new ArrayList<>();
        LinkedList<DelayedElement> linkedList = new LinkedList<>();
        list.add(element);
        linkedList.add(element);

        for (int i = 0; i < 5; i++) {
            DelayedElement newElement = new DelayedElement(1000 + i * 500);
            queueManager.addElement(newElement);
            list.add(newElement);
            linkedList.add(newElement);
        }

        for (DelayedElement e : list) {
            System.out.println("List element: " + e);
        }

        for (DelayedElement e : linkedList) {
            System.out.println("LinkedList element: " + e);
        }

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue: " + takenElement);

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 10);
        }

        for (int i : intList) {
            System.out.println("Integer list element: " + i);
        }

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        for (String s : stringList) {
            System.out.println("String list element: " + s);
        }
    }
}