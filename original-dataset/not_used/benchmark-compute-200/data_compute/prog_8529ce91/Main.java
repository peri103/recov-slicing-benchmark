import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        /* other operations */
        String key1 = new String("A");
        String key2 = new String("B");
        map.put(key1, 10);
        map.put(key2, 20);
        /* other operations */
        for (String key : map.keySet()) {
            int temp = map.get(key);
            temp *= 2; 
        }
        /* other operations */
        int x = map.containsKey(new String("A")) ? 1 : 2;
        if (x == 1) {
            map.put(new String("C"), 30);
        } else {
            map.put(new String("D"), 40);
        }
        /* write */ map.put(key1, 100);
        /* other operations */
        map.put(new String("E"), 50);
        map.put(new String("F"), 60);
        /* other operations */
        /* read */ int ret = map.get(key1);
        System.out.println("Read value: " + ret);
    }
}