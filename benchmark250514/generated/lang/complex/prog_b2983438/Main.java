import org.apache.commons.lang3.mutable.MutableByte;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableByte mutableByte = new MutableByte((byte) 0);
        MutableInt mutableInt = new MutableInt(100);
        MutableBoolean mutableBoolean = new MutableBoolean(true);

        // Perform some operations with MutableInt
        mutableInt.add(50);
        System.out.println("MutableInt value: " + mutableInt.getValue());

        // Perform some operations with MutableBoolean
        mutableBoolean.setFalse();
        System.out.println("MutableBoolean value: " + mutableBoolean.getValue());

        // Original write operation
        /* write */ mutableByte.setValue((byte) 10);

        // More operations with MutableInt
        mutableInt.increment();
        System.out.println("MutableInt incremented value: " + mutableInt.getValue());

        // Operations with a simple loop
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Original read operation
        /* read */ byte value = mutableByte.getValue();
        System.out.println("MutableByte value: " + value);

        // More operations with MutableBoolean
        mutableBoolean.setTrue();
        System.out.println("MutableBoolean new value: " + mutableBoolean.getValue());

        // Perform a calculation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);
    }
}