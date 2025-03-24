import java.util.WeakHashMap;
public class Main {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();
        String key1 = "Element1";
        String key2 = "Element2";
        String misleadingKey = "Mislead";
        /* other operations */
        weakMap.put(misleadingKey, 999);
        /* other operations */
        int randomCalculation = 5678 * 1234 + 888;
        /* other operations */
        if (randomCalculation % 2 == 0) {
            weakMap.put(key1, 5);
        } else {
            /* write */ weakMap.put(key1, 10);
        }
        /* other operations */
        weakMap.put(key2, 20);
        weakMap.remove(misleadingKey);
        /* other operations */
        boolean condition = randomCalculation < 10000;
        if (condition) {
            weakMap.put("Extra", 30);
        }
        /* other operations */
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
