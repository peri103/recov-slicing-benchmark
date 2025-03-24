import java.util.Map;
import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        Map<Key, Integer> map = new WeakHashMap<>();
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");
        /* other operations */
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        /* other operations */
        map.put(key1, 10);
        map.put(new Key("key3"), 30);
        /* misleading operation */
        if (sum % 2 == 0) {
            map.put(key2, 20);
        }
        /* write */ map.put(key1, 42);
        map.put(new Key("key4"), 40);
        map.remove(new Key("key3"));
        /* misleading operation */
        if (sum % 2 == 0) {
            map.put(key2, 25);
        }
        /* read */ int ret = map.get(key1);
        System.out.println("The value at read point is: " + ret);
    }
    static class Key {
        private String id;
        Key(String id) {
            this.id = id;
        }
        @Override
        public int hashCode() {
            return id.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Key key = (Key) obj;
            return id.equals(key.id);
        }
    }
}