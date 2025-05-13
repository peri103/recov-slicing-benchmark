import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        ReferenceMap<String, String> referenceMap = new ReferenceMap<>();
        /* write */ referenceMap.put("key", "value");
        /* read */ String value = referenceMap.get("key");
        System.out.println(value);
    }
}