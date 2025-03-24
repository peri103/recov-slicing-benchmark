import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        int mysteryValue = 176;
        int falseLead = mysteryValue % 22;
        boolean valueMeasured = falseLead > 150;
        bitSet.set(5);
        bitSet.set(10);
        /* other operations unrelated to the get */
        BitSet extraBits = new BitSet();
        extraBits.set(2);
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                extraBits.flip(i);
            }
        }
        /* write */
        if (!valueMeasured || extraBits.get(14)) {
            bitSet.set(8);
        } else {
            bitSet.set(6);
        }
        /* other operations that do not affect the read */
        for (int j = 0; j < 10; j++) {
            bitSet.flip(6);
        }
        bitSet.or(extraBits);
        bitSet.clear(5);
        /* read */ 
        boolean ret = bitSet.get(8);
        System.out.println("Value at bit position 8: " + ret);
    }
}
