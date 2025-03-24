import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        /* write */ map.put("key", 123);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}