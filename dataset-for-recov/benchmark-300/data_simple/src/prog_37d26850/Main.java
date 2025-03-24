import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        /* write */ table.put("key", 42);
        /* read */ Integer value = table.get("key");
        System.out.println(value);
    }
}