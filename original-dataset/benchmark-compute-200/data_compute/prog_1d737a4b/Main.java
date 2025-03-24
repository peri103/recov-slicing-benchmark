import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        int rand = 1234 * 2 + 56789 - 12345;
        int key = (rand % 10) + 5;
        map.put(1, 100);
        map.put(2, 200);
        if ((rand % 2) == 0) {
            /* write */map.put(3, 300);
        } else {
            map.put(3, 300);
        }
        map.put(5, 500);
        map.computeIfAbsent(key, k -> 700);
        map.replace(2, 250);
        map.remove(5);
        /* read */ Integer ret = map.get(3);
        System.out.println(ret);
    }
}