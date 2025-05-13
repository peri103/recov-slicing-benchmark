import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> map = new LinkedMap<>();
        /* write */ map.put("key", 100);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}