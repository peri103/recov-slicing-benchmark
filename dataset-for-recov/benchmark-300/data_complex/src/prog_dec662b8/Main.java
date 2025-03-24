import java.util.Hashtable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        /* write */ hashtable.put("key", 123);

        // Processing the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList value: " + num);
        }

        // Processing the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList value: " + str);
        }

        /* read */ Integer value = hashtable.get("key");
        System.out.println("Hashtable value: " + value);

        // Additional complex operations
        Hashtable<String, String> anotherHashtable = new Hashtable<>();
        anotherHashtable.put("anotherKey", "AnotherValue");
        String anotherValue = anotherHashtable.get("anotherKey");
        System.out.println("Another Hashtable value: " + anotherValue);

        ArrayList<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubleList.add(i * 1.5);
        }

        for (Double d : doubleList) {
            System.out.println("Double ArrayList value: " + d);
        }
    }
}