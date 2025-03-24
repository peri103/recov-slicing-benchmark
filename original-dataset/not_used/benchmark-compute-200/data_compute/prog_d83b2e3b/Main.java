import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        /* other operations */
        for (int i = 0; i < 5; i++) {
            map.put(i, "Value" + i);
        }
        int magicNumber = 4 * 11 + 7 - 35;
        String misleadingValue = "Misleading";
        map.put(10, misleadingValue);
        /* other operations */
        int condition = 0;
        if (magicNumber % 3 == 0) {
            condition = 1;
        }
        /* misleading write point */
        if (condition == 0) {
            map.put(2, "UpdatedValue");
        }
        /* other operations */
        int keyToRead = magicNumber % 5;
        if (condition == 1) {
            /* write */ map.put(keyToRead, "CorrectValue");
        }
        /* other operations */
        String otherGet = map.get(10);
        System.out.println("Other get operation: " + otherGet);
        /* other operations */
        /* read */ String ret = map.get(keyToRead);
        System.out.println("Read value: " + ret);
    }
}