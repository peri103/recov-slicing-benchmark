import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(10, 100);
        map.put(20, 200);
        int x = 5;
        if (x < 10) {
            int computation = x * 42 - 17;
            map.put(30, 300);
        }
        map.put(40, 400);
        map.remove(10);

        if (x % 2 == 0) {
            map.put(30, 310);
        } else {
            /* write */map.put(30, 320);
        }
        map.put(50, 500);
        map.put(60, 600);
        /* read */ int ret = map.get(30);
        System.out.println(ret);
    }
}