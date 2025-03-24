import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        /* write */ map.put("key", 42);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add("Element " + i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        for (String element : linkedList) {
            System.out.println("LinkedList element: " + element);
        }

        SortedMap<String, Integer> anotherMap = new TreeMap<>();
        anotherMap.put("anotherKey", 100);
        System.out.println("Another map value: " + anotherMap.get("anotherKey"));

        /* read */ Integer value = map.get("key");
        System.out.println("Original map value: " + value);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(99);
        newList.add(88);
        newList.add(77);

        for (int i = 0; i < newList.size(); i++) {
            System.out.println("New list element: " + newList.get(i));
        }
    }
}