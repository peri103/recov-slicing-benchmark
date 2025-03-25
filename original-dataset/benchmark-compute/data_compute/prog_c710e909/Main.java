import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(10);
        bitSet.set(20);
        bitSet.set(30);
        if (bitSet.get(15)) {
            bitSet.clear(10);
        } else {
            bitSet.set(19);
        }
        bitSet.flip(30);
        int hiddenTrigger = (5 * 3) % 2;
        if (hiddenTrigger == 1) {
            /* write */ bitSet.set(5);
        } else {
            bitSet.set(25);
        }
        BitSet anotherSet = new BitSet();
        anotherSet.set(5);
        bitSet.or(anotherSet);
        anotherSet.set(24, 28);
        int mask = 2 * 2 * 2;
        anotherSet.and(bitSet);
        /* read */ boolean value = bitSet.get(5);
        System.out.println("Read value from BitSet at index 5: " + value);
    }
}
