import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        /* write */ map.put("key1", 100);
        /* read */ Integer value = map.get("key1");
        System.out.println(value);
    }
}