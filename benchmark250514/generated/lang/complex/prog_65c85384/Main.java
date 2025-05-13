import org.apache.commons.lang3.mutable.MutableByte;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableDouble;

public class Main {
    public static void main(String[] args) {
        MutableByte mutableByte = new MutableByte();
        /* write */ mutableByte.setValue((byte) 5);

        // Additional complex operations
        MutableInt mutableInt = new MutableInt(100);
        MutableDouble mutableDouble = new MutableDouble(50.5);

        mutableInt.add(25);
        mutableDouble.subtract(10.5);

        int intValue = mutableInt.getValue();
        double doubleValue = mutableDouble.getValue();

        System.out.println("MutableInt value: " + intValue);
        System.out.println("MutableDouble value: " + doubleValue);

        // Some more operations
        intValue *= 2;
        doubleValue /= 2.5;

        System.out.println("Updated MutableInt value: " + intValue);
        System.out.println("Updated MutableDouble value: " + doubleValue);

        // Further operations
        intValue += 10;
        doubleValue -= 5.5;

        System.out.println("Final MutableInt value: " + intValue);
        System.out.println("Final MutableDouble value: " + doubleValue);

        // Read the value of MutableByte
        /* read */ byte value = mutableByte.getValue();
        System.out.println("MutableByte value: " + value);

        // Additional logic
        if (value > 0) {
            intValue += value;
            doubleValue += value;
        }

        System.out.println("Final values after adding MutableByte:");
        System.out.println("MutableInt value: " + intValue);
        System.out.println("MutableDouble value: " + doubleValue);
    }
}