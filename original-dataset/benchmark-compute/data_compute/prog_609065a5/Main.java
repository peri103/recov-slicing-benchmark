import java.util.IdentityHashMap;
public class Main {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int rand = 1234 * 4321 + 777 + 888 + 999;
        int placeholder = rand / 2;
        map.put(4, "Four"); 
        map.remove(1);
        map.put(1, "Uno");
        if (placeholder % 3 == 0) {
            map.put(5, "Five");
        } else {
            map.remove(2);
        }
        /* write */ map.put(2, "Deux"); 
        map.put(6, "Six"); 
        map.put(null, "Null");
        String intermediary = map.get(3); 
        /* read */ String ret = map.get(2);
        System.out.println(ret);
    }
}
