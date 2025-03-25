import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        int calculation = (123 * 3) - (500 / 2) + 1234;
        boolean condition = calculation % 4 == 0;

        map.put("five", 5);

        if (!condition) {
            map.put("two", 10);  
        }
        if (condition) {
            map.put("special", 7); 
        } else {
            /* write */ map.put("special", 9); 
        }

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        /* read */ int ret = map.get("special");
        System.out.println("Read value: " + ret); 
    }
}
