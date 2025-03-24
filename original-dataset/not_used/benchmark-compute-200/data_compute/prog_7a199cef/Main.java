import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        int x = 45 * 2;
        if (x % 2 == 0) {
            hashtable.put(4, "Four");
        } else {
            hashtable.put(5, "Five");
        }
        hashtable.remove(4);
        hashtable.remove(2);
        /* write */ hashtable.put(2, "Twenty"); 
        for (int i = 6; i <= 10; i++) {
            hashtable.put(i, "Number " + i);
        }
        /* read */ String ret = hashtable.get(2); 
        System.out.println(ret);
    }
}
