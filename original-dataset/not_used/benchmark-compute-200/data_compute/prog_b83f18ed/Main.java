import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();
        bitset.set(2);
        bitset.set(5);
        bitset.set(10);
        /* other operations */
        int magicNumber = (int) System.currentTimeMillis() % 100;
        int justNoise = magicNumber * 42 + 101;
        boolean keyDecision = (justNoise % 3 == 0);
        /* other operations */
        int misleadingCondition = magicNumber * 3;
        if (misleadingCondition % 5 == 0) {
            bitset.clear(2);
        } else {
            bitset.set(20);
        }
        if (keyDecision) {
            /* write */ bitset.set(7);
        }
        bitset.flip(3);
        bitset.set(22);
        bitset.clear(5);
        bitset.set(15);
        /* read */ boolean ret = bitset.get(7);
        System.out.println("Read value: " + ret);
    }
}
