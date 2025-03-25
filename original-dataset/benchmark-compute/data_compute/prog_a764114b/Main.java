import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(10, "Hello");
        table.put(20, "World");
        table.put(30, "Java");
        int index = (10 * 5) - 40 + 2; 
        if (index % 2 == 0) {
            table.put(15, "NotAffectingValue"); 
            table.put(12, "ConfusingValue"); 
        } else {
            table.put(25, "StillDoesNotAffect");
        }
        /* write */ table.put(12, "AffectingValue");
        table.put(13, "AnotherValue");
        table.remove(30); 
        String unrelatedRead = table.get(15);
        table.put(14, unrelatedRead);
        /* read */ String ret = table.get(12);
        System.out.println("Retrieved value: " + ret);
    }
}
