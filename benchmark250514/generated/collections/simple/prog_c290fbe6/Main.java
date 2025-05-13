import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        
        /* write */ map.put("key", 42);
        
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}