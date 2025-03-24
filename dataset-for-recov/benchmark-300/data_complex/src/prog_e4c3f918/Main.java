import java.util.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList and LinkedList
        list.add(10);
        list.add(20);
        linkedList.add("First");
        linkedList.add("Second");

        /* write */ hashtable.put("key", 42);

        // Processing the ArrayList and LinkedList
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        // Adding more elements to the ArrayList
        list.add(30);
        list.add(40);

        // Processing the ArrayList again
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + list.get(i));
        }

        /* read */ Integer value = hashtable.get("key");
        System.out.println("Value from Hashtable: " + value);

        // Adding more elements to the LinkedList
        linkedList.add("Third");
        linkedList.add("Fourth");

        // Processing the LinkedList again
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element at index " + i + ": " + linkedList.get(i));
        }
    }
}