import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        int cond = 5;

        int misleadingKey = cond - 4;
        map.put(misleadingKey, "Four"); 

        int controlVariable = cond * 2 / 3 + 1;
        if (controlVariable % 3 == 0) {
            map.put(1, "Write Point!");
        } else {
            /* write */ map.put(1, "Alternative!");
        }

        String randomAccessValue = map.get(3);
        map.remove(3); 
        map.put(3, randomAccessValue); 

        map.put(10, "Ten"); 
        /* read */ String ret = map.get(1);
        System.out.println("Retrieved Value: " + ret);
    }
}