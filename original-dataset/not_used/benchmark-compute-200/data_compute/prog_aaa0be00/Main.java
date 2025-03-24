import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        /* other operations */
        map.put(100, "Initial");
        map.put(200, "Unrelated");
        map.put(300, "Irrelevant");
        /* confusing operations */
        String result = complexLogic(map);
        /* more operations */
        /* read */ String ret = map.get(150);
        System.out.println(ret);
    }
    public static String complexLogic(ConcurrentHashMap<Integer, String> map) {
        int a = 5 * 5 + 20;
        int b = 50;
        /* unrelated computations */
        String temp = "Temporary";
        if ((a + b) % 2 == 0) {
            map.put(400, "Dummy");
        } else {
            /* write */ map.put(150, "Correct" + temp);
        }
        map.put(500, "Fake");
        map.remove(200);
        return map.getOrDefault(300, "Default");
    }
}
