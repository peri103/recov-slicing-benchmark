import java.util.concurrent.ConcurrentSkipListMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add("First Element");
        list.add("Second Element");

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);

        /* write */ map.put(1, "Hello, World!");

        // Iterating through the ArrayList and printing elements
        for (String element : list) {
            System.out.println(element);
        }

        // Iterating through the LinkedList and printing elements
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Adding more elements to the map
        map.put(2, "Another Value");
        map.put(3, "Yet Another Value");

        // Reading from the map
        /* read */ String value = map.get(1);
        System.out.println(value);

        // Printing all elements in the map
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Adding more elements to the ArrayList
        list.add("Third Element");
        list.add("Fourth Element");

        // Printing the size of the ArrayList
        System.out.println("ArrayList size: " + list.size());

        // Adding more elements to the LinkedList
        linkedList.add(300);
        linkedList.add(400);

        // Printing the size of the LinkedList
        System.out.println("LinkedList size: " + linkedList.size());
    }
}