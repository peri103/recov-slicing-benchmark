import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "Value" + i);
        }
        for (int i = 0; i < 5; i++) {
            map.put(-i, "Negative" + i);
        }
        int x = 20;
        if (x * 2 == 40) {
            x = x - 10;
        } else {
            x = x + 10;
        }
        /* misleading write */
        map.put(1, "WrongValue");  
        boolean toggle = true;
        String manipulation = "";
        for (int i = 0; i < 3; i++) {
            manipulation += toggle ? "A" : "B";
            toggle = !toggle;
        }
        map.remove(3);
        /* write */ map.put(2, "DesiredValue");  
        /* read */ String retrieved = map.get(2);  
        System.out.println("Retrieved value: " + retrieved);
    }
}
