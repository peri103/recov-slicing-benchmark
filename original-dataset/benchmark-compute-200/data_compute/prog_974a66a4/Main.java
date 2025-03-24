import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        /* other operations */
        int magicNumber = 1234 * 4321 + 777 + 888 + 999;
        /* other operations */
        int index = (magicNumber % 10) + 1;
        /* other operations */
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        /* misleading operations */
        if (index % 2 == 0) {
            map.put(1, "two") /* this does not affect ret */;
        } else {
            map.put(3, "three") /* this does not affect ret */;
        }
        /* write */ map.put(4, "four"); 
        /* other operations */
        int irrelevantIndex = (magicNumber * 3) % 5;
        map.put(irrelevantIndex, "not affecting ret");
        /* read */ String ret = map.get(4);
        System.out.println(ret);
    }
}