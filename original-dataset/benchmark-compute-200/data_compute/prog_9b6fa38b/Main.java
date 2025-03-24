import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int someValue = 50;
        int decisionValue = someValue % 3 + 1;
        /* write */ if (decisionValue == 2) {
            map.put(2, "Updated Two");
        }
        else {
            map.put(4, "Four");  
        }
        map.put(5, "Five");
        map.remove(3);
        map.put(3, "Replaced Three");
        /* read */ String value = map.get(2);
        System.out.println("The read value is: " + value);  
    }
}
