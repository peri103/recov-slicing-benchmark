import java.util.concurrent.ConcurrentSkipListMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        ArrayList<String> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        list.add("element1");
        list.add("element2");

        // Adding elements to the LinkedList
        linkedList.add(100);
        linkedList.add(200);

        /* write */ map.put(1, "value");

        // Iterating through the LinkedList and adding elements to the ArrayList
        for (Integer num : linkedList) {
            list.add(num.toString());
        }

        // Iterating through the ArrayList and printing elements
        for (String element : list) {
            System.out.println(element);
        }

        /* read */ String value = map.get(1);
        System.out.println(value);

        // Adding more elements to the ConcurrentSkipListMap
        map.put(2, "anotherValue");
        map.put(3, "yetAnotherValue");

        // Iterating through the ConcurrentSkipListMap and printing elements
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}