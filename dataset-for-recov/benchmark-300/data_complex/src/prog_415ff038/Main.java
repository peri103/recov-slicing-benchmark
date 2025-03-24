import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /* write */ map.put("key", 42);
        
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add("Element " + i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
        
        for (String s : linkedList) {
            System.out.println("LinkedList value: " + s);
        }
        
        /* read */ Integer value = map.get("key");
        System.out.println("Value from map: " + value);
        
        ConcurrentHashMap<String, String> anotherMap = new ConcurrentHashMap<>();
        anotherMap.put("anotherKey", "AnotherValue");
        String anotherValue = anotherMap.get("anotherKey");
        System.out.println("Another value from map: " + anotherValue);
        
        ArrayList<Integer> anotherList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            anotherList.add(i * 5);
        }
        
        for (int i = 0; i < anotherList.size(); i++) {
            System.out.println("Another list value: " + anotherList.get(i));
        }
    }
}