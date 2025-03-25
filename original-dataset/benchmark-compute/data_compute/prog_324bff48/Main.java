import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(5);
        int rand = 13579;
        int calculation = rand * 2 / 3 + 7;
        for (int i = 0; i < 5; i++) {
            bitSet.set(i, i % 2 == 0);
        }
        if (calculation % 2 == 0) {
            bitSet.set(1, false); 
        } else {
            /* write */ bitSet.set(2);
        }
        if (bitSet.cardinality() > 2) {
            bitSet.clear(3);
        }
        bitSet.flip(4);
        /* read */ boolean ret = bitSet.get(2);
        System.out.println("Value at bit 2: " + ret);
    }
}
