import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        int magicNumber = (int) (Math.random() * 10);
        for (int i = 0; i < magicNumber; i++) {
            map.put(i + 10, "extra");
        }
        if (magicNumber % 2 == 0) {
            map.put(5, "five");
        } else {
            /* write */ map.put(6, "six");
        }
        map.remove(0);
        map.remove(magicNumber);
        map.put(100, "hundred"); 
        map.put(101, "hundred_one");
        /* read */ String ret = map.get(6);
        System.out.println("Retrieved value: " + ret);
    }
}
