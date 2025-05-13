import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> linkedMap = new LinkedMap<>();
        /* write */ linkedMap.put("key", 42);
        /* read */ int value = linkedMap.get("key");
        System.out.println(value);
    }
}