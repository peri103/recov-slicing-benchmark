import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key2");
        String key3 = new String("key3");
        map.put(key1, 10);
        map.put(key2, 20);
        int hash = key1.hashCode() + key2.hashCode();
        int condition = hash % 10;
        /* write */ if (condition < 5) {
            map.put(key1, 15);
        }
        map.put("unrelatedKey", 99); 
        map.put(key3, 30);          
        map.remove("unrelatedKey");   
        int temp = map.get(key2);    
        /* read */ int ret = map.get(key1);
        System.out.println("Retrieved Value: " + ret);
    }
}
