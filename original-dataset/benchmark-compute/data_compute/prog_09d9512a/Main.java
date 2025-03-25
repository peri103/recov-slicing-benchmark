import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        int calculations = 42 * 10 - 5 + 7;
        int complexLogic = (calculations % 5 == 0) ? 4 : 1;
        boolean flag = calculations > 100;
        if (flag) {
            bitSet.set(5);
            bitSet.clear(0);
        } else {
            bitSet.set(6);
        }
        if (complexLogic == 1) {
            /* write */ bitSet.set(1);
        } else if (complexLogic == 4) {
            bitSet.clear(1);
        }
        bitSet.flip(3);
        bitSet.set(7, 10);
        if (!flag) {
            bitSet.clear(2);
            bitSet.clear(4);
        }
        /* read */ boolean ret = bitSet.get(1);
        System.out.println("Value at bit position 1: " + ret);
    }
}
