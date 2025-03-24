import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        int conditionValue = 1024;
        int misleadingKey = 15;
        if (conditionValue % 2 == 0) {
            map.put(25, "X");
        } else {
            map.put(5, "Y");
        }
        map.put(misleadingKey, "M");
        if (conditionValue > 1000) {
            /* write */map.put(20, "Z");
        } else {
            map.put(20, "W");
        }
        map.remove(15);
        map.containsKey(10);
        String[] distractions = {"Don", "John", "Ron"};
        String unused = distractions[1];
        /* read */String ret = map.get(20);
        System.out.println(ret);
    }
}