import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, Integer> referenceMap = new ReferenceMap<>();
        /* write */ referenceMap.put("key", 42);
        /* read */ Integer value = referenceMap.get("key");
        System.out.println(value);
    }
}