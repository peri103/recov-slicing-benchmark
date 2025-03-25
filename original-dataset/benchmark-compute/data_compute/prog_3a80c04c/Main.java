import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        /* write */map.put("C", 30);
        int computedKeyIndex = 1;
        int baseValue = 5;
        String[] keys = {"A", "B", "C", "D"};
        int unrelatedCalculation = baseValue * 2;
        map.put(keys[unrelatedCalculation % 2], unrelatedCalculation);
        map.put("D", 40);
        map.put("E", 50);
        map.remove("E");
        map.put("B", map.get("B") + 5);
        if (baseValue % 2 == 0) {
            map.put("C", 35);
        } else {
            map.put("B", 35);
        }
        /* read */int ret = map.get("C");
        System.out.println("Read value: " + ret);
    }
}
