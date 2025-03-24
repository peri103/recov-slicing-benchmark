import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 10; i++) {
            hashtable.put(i, i * i);
        }
        /* other operations */
        int computation = 5678 * 1234 + 1111;
        hashtable.put(11, computation % 10);
        hashtable.put(12, computation % 12);
        int accessKey = 4;
        /* write */ hashtable.put(accessKey, 99);
        if (computation % 20 == 0) {
            hashtable.remove(15);
        } else {
            hashtable.put(16, 160);
        }
        hashtable.put(17, 170);
        int unnecessary = hashtable.get(6);
        unnecessary += 20;
        hashtable.put(5, 50);
        hashtable.put(7, 70);
        /* read */ int ret = hashtable.get(accessKey);
        System.out.println("Retrieved value: " + ret);
    }
}