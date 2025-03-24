import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        /* write */ map.put(1, "Hello");
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}