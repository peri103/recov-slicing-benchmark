import org.apache.commons.collections4.map.Flat3Map;

public class Main {
    public static void main(String[] args) {
        Flat3Map<String, Integer> map = new Flat3Map<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}