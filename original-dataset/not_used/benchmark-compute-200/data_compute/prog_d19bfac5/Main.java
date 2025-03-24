import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        /* other operations */
        int rand = 1234 * 4321 + 777 + 888 + 999;
        /* other operations */
        int index = (rand / 100) % 10; 
        /* other operations */
        bitSet.set(0, false);  
        bitSet.set(1, true);   
        /* conditional execution */
        if (index % 2 == 0) {
            /* obfuscation */ bitSet.flip(index % 10);  
        } else {
            /* write */ bitSet.set(1);
        }
        /* other operations */
        /* read */ boolean ret = bitSet.get(1);
    }
}
