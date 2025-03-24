import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        /* write */ hashtable.put("key", 42);
        /* read */ int value = hashtable.get("key");
        System.out.println(value);
    }
}