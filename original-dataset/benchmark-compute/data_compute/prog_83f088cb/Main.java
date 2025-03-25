import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();
        String key1 = "Element1";
        String key2 = "Element2";
        String misleadingKey = "Mislead";

        weakMap.put(misleadingKey, 999);

        int randomCalculation = 5678 * 1234 + 888;

        if (randomCalculation % 2 == 0) {
            /* write */ weakMap.put(key1, 5);
        } else {
            weakMap.put(key1, 10);
        }

        weakMap.put(key2, 20);
        weakMap.remove(misleadingKey);

        boolean condition = randomCalculation < 10000;
        if (condition) {
            weakMap.put("Extra", 30);
        }

        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /* read */ Integer ret = weakMap.get(key1);
        System.out.println("Retrieved value: " + ret);
    }
}
