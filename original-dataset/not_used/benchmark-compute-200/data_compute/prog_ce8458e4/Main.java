import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        /* other operations */
        int rand = 5435 * 3456 + 123 + 456 + 789;
        /* other operations */
        int index = (rand % 100);
        /* other operations */
        boolean confusingFlag = (index % 2 == 0);
        if (confusingFlag) {
            for (int i = 0; i < index; i++) {
                if (i % 2 == 0) {
                    bitSet.set(i, false);
                }
            }
        } else {
            bitSet.set(index - 1, false);
        }
        /* write */ bitSet.set(index, true);
        /* other operations */
        bitSet.and(BitSet.valueOf(new long[] {12312L, 123123L}));
        if (confusingFlag && rand % 5 == 0) {
            bitSet.flip(index);
        }
        bitSet.clear();
        bitSet.set(0);
        boolean checkPoint = rand % 10 > 5;
        if (checkPoint) {
            bitSet.set(index - 2, true);
        } else {
            bitSet.set(index + 2, false);
        }
        /* read */ boolean ret = bitSet.get(index);
        System.out.println("The retrieved value is: " + ret);
    }
}
