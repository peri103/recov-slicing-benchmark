import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        int seed = 1234 * 4321 + 777 + 888 + 999;
        int bitToSet = (seed % 128) + 5; 
        for (int i = 0; i < 32; i++) {
            bitSet.set(i, (i % 2 == 0)); 
        }
        if ((bitToSet & 1) == 1) {
            bitSet.set(10);
            bitSet.clear(15);
            int temp = bitSet.cardinality(); 
        }
        /* write */ bitSet.set(bitToSet);
        if (bitSet.cardinality() > 16) {
            bitSet.clear(20);
        } else {
            bitSet.set(25);
        }
        System.out.println("Bit 5 set: " + bitSet.get(5));
        System.out.println("Bit 15 set: " + bitSet.get(15));
        /* read */ boolean ret = bitSet.get(bitToSet); 
        System.out.println("Read bit " + bitToSet + ": " + ret);
    }
}
