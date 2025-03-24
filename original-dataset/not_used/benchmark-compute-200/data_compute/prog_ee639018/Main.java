import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("A", 10);
        table.put("B", 20);
        int x = 100;
        x += 200;
        if (x > 50) {
            /* write */ table.put("C", 30);
        } else {
            table.put("D", 40);
        }
        table.put("E", 50);
        table.computeIfPresent("A", (key, val) -> val + 5);
        table.remove("B");
        int sum = 0;
        for (Integer value : table.values()) {
            sum += value;
        }
        if (x % 2 == 0) {
            table.put("F", sum);
        } else {
            table.put("G", sum / 2);
        }
        /* read */ int ret = table.get("C");
        System.out.println("Retrieved value: " + ret);
    }
}