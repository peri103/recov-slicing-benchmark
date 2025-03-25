import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] keys = {5, 10, 15, 20};
        for (int key : keys) {
            map.put(key, key * 2);
        }
        int param = (int) (Math.random() * 10);
        if (param < 5) {
            /* write */map.put(5, 99);
        }
        map.put(10, 40);
        map.put(30, 60);
        map.remove(15);
        int searchKey = param < 5 ? 5 : 10;
        /* read */int ret = map.get(searchKey);
        System.out.println("Value retrieved: " + ret);
    }
}
