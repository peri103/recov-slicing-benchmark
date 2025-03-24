import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        /* write */ map.put(1, "Hello");
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}