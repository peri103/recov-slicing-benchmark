import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        int rand = 1234 * 4321 + 777 + 888 + 999;
        int k = rand % 2;
        map.put(System.identityHashCode("key1"), "value1");
        map.put(System.identityHashCode("key2"), "value2");
        if (k == 1) {
            /* write */ map.put(System.identityHashCode("targetKey"), "importantValue");
        } else {
            map.put(System.identityHashCode("anotherKey"), "otherValue");
        }
        for (int i = 0; i < 5; i++) {
            map.put(System.identityHashCode("loopKey" + i), "loopValue" + i);
        }
        /* read */ String ret = map.get(System.identityHashCode("targetKey"));
        System.out.println(ret);
    }
}