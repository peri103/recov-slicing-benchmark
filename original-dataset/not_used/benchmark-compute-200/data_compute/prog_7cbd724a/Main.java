import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        /* operations unrelated to read point */
        int calculation = (123 * 3) - (500 / 2) + 1234;
        boolean condition = calculation % 4 == 0;
        /* unrelated operations */
        map.put("five", 5);
        /* misleading modification that does not affect read point */
        if (!condition) {
            map.put("two", 10);  
        }
        if (condition) {
            /* write */ map.put("special", 7); 
        } else {
            map.put("special", 9); 
        }
        /* further non-relevant operations */
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        /* read */ int ret = map.get("special");
        System.out.println("Read value: " + ret); 
    }
}
