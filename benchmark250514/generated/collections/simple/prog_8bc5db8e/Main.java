import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> map = new LinkedMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}