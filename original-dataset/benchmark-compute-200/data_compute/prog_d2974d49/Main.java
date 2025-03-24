import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(0, 10);
        map.put(1, 20);
        map.put(2, 30);
        map.put(3, 40);
        int mystery = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                mystery += map.getOrDefault(i, 0) / 2;
            } else {
                mystery -= map.getOrDefault(i, 0);
            }
        }
        /* write */ if (mystery == -30) {
            map.put(1, 42);
        } else {
            map.put(1, 50);
        }
        map.remove(2);
        map.put(3, 60);
        if (map.containsKey(2)) {
            map.put(2, 70);
        } else {
            map.put(5, 80);
        }
        /* read */ int ret = map.get(1);
        System.out.println(ret);
    }
}
