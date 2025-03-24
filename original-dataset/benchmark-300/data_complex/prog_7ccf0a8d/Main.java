import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        /* write */ map.put("key", 123);
        
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
            linkedList.add("Item " + i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
        
        for (String item : linkedList) {
            System.out.println("LinkedList value: " + item);
        }
        
        /* read */ int value = map.get("key");
        System.out.println("Value from HashMap: " + value);
        
        HashMap<String, String> anotherMap = new HashMap<>();
        anotherMap.put("anotherKey", "Hello, World!");
        System.out.println("Another Map Value: " + anotherMap.get("anotherKey"));
    }
}