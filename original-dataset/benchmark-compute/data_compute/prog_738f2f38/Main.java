import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        /* write */hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        int randomSeed = (int) (Math.random() * 50);
        if (randomSeed > 20) {
            hashtable.put(4, "Ignore Four");
        } else {
            hashtable.put(5, "Ignore Five");
        }
        
        if (randomSeed % 2 == 0) {
            hashtable.put(2, "Two Updated");
        }
        hashtable.remove(4);
        hashtable.put(6, "Ignore Six");
        /* read */
        String ret = hashtable.get(2);
        System.out.println("Retrieved Value: " + ret);
    }
}
