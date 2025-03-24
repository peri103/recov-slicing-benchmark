import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "ten");
        /* write */ map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        int rand = (int) System.currentTimeMillis() % 4;
        String operation = "unknown";
        switch (rand) {
            case 0:
                operation = map.get(10);
                break;
            case 1:
                operation = map.get(30);
                break;
            case 2:
                operation = map.remove(10);
                break;
            case 3:
                map.put(50, "fifty");
                break;
            default:
                map.put(60, "sixty");
        }
        map.put(70, "seventy");
        /* Misleading operations that don't affect the read value */
        if (rand % 2 == 0) {
            map.put(80, "eighty");
        } else {
            map.put(90, "ninety");
        }
        map.remove(30);
        /* read */ String ret = map.get(20);
        System.out.println("Value retrieved: " + ret);
    }
}
