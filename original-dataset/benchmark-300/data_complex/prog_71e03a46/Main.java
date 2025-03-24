import java.util.SortedMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the list and linkedList
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
            linkedList.add("Element " + i);
        }

        /* write */ map.put("key", 123);

        // Processing the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        for (String element : linkedList) {
            System.out.println("LinkedList element: " + element);
        }

        // Adding more elements to the map
        map.put("anotherKey", 456);
        map.put("yetAnotherKey", 789);

        /* read */ Integer value = map.get("key");
        System.out.println("Value from map: " + value);

        // Additional complex operations
        SortedMap<String, Integer> anotherMap = new TreeMap<>();
        anotherMap.put("newKey", 999);
        anotherMap.put("anotherNewKey", 111);

        for (String key : anotherMap.keySet()) {
            System.out.println("Another map key: " + key + ", value: " + anotherMap.get(key));
        }

        // More complex operations with list and linkedList
        List<Integer> newList = new ArrayList<>(list);
        newList.addAll(anotherMap.values());

        for (int i = 0; i < newList.size(); i++) {
            System.out.println("New list element: " + newList.get(i));
        }
    }
}