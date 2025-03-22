import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        /* write */ sortedMap.put("key1", 100);
        /* read */ int value = sortedMap.get("key1");
        System.out.println(value);
    }
}