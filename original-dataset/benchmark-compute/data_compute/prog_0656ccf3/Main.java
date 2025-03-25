import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(0, "Initial");
        table.put(1, "Value1");
        table.put(2, "Value2");
        table.put(3, "Value3");
        int x = (int) (Math.random() * 10);
        int y = x * 3 + 2;
        for (int i = 4; i < 10; i++) {
            table.put(i, "Misleading" + i);
        }
        
        if (y % 2 == 0) {
            table.put(1, "Correct Write");  
        } else {
            /* write */table.put(1, "Wrong Write");
        }
        table.put(11, "Other Write");
        table.remove(0);
        table.put(x + 10, "Confusion" + y);
        /* read */ String ret = table.get(1);  
        System.out.println("Retrieved: " + ret);
    }
}