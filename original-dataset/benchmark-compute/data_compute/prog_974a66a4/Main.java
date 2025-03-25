import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        int magicNumber = 1234 * 4321 + 777 + 888 + 999;

        int index = (magicNumber % 10) + 1;

        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");

        if (index % 2 == 0) {
            map.put(1, "two") /* this does not affect ret */;
        } else {
            map.put(3, "three") /* this does not affect ret */;
        }
        map.put(4, "four"); 

        int irrelevantIndex = (magicNumber * 3) % 5;
        /* write */ map.put(irrelevantIndex, "not affecting ret");
        /* read */ String ret = map.get(4);
        System.out.println(ret);
    }
}