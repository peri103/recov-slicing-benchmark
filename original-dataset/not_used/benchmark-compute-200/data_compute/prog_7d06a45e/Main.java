import java.util.BitSet;
public class Main {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.clear(1);
        int importantValue = computeImportantValue();
        int misleadingValue = (importantValue * 3) % 5;
        if (misleadingValue == 0) {
            bitSet.set(4); 
        } else {
            /* write */ bitSet.set(3); 
        }
        bitSet.clear(2); 
        bitSet.set(5); 
        boolean flag = (bitSet.cardinality() > 2);
        if (flag) {
            bitSet.set(7);
        } else {
            bitSet.clear(3);
        }
        bitSet.flip(6);
        bitSet.set(8);
        bitSet.clear(8); 
        int anotherRead = bitSet.get(0) ? 1 : 0;
        /* read */ boolean ret = bitSet.get(3);
        System.out.println("Read value at index 3: " + ret);
    }
    private static int computeImportantValue() {
        int a = 100;
        int b = 50;
        int c = 25;
        return a - b + c;
    }
}
