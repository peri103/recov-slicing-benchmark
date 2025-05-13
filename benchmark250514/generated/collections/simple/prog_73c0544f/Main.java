import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, String> map = new ReferenceMap<>();
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}