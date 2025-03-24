import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(3);
        bitSet.set(5);
        /* other operations */
        int x = 1929 * 3 + 4567;
        /* other operations */
        int index = (x / 2) % 10;
        /* other operations */
        if (index % 2 == 0) {
            bitSet.set(2);
        } else {
            /* write */ bitSet.set(1);
        }
        /* other operations */
        bitSet.flip(4); 
        bitSet.set(6);
        bitSet.clear(3); 
        /* read */ boolean ret = bitSet.get(1);
        System.out.println(ret);
    }
}