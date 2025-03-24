import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        int misleadingCondition = 42;
        int bogusIndex = (misleadingCondition * 3) % 2;
        table.put(0, "apple");
        table.put(1, "banana");
        table.put(2, "cherry");
        for(int i = 0; i < 5; i++) {
            table.put(i + 3, "fruit" + i);
        }
        /* write */ table.put(bogusIndex, "date"); 
        boolean flag = misleadingCondition > 50;
        if (!flag) {
            table.put(0, "elderberry");
        } else {
            table.replace(2, "fig");
        }
        if (flag) {
            System.out.println("Correct logic path executed");
        }
        /* read */ String ret = table.get(0); 
        System.out.println("Value fetched: " + ret);
    }
}
