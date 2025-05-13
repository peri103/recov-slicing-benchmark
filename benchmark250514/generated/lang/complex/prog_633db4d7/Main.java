import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableDouble mutableDouble = new MutableDouble();
        MutableInt mutableInt = new MutableInt(100);
        MutableBoolean mutableBoolean = new MutableBoolean(false);

        // Perform some operations using MutableInt
        mutableInt.add(50);
        mutableInt.subtract(30);
        System.out.println("MutableInt value: " + mutableInt.getValue());

        // Perform some operations using MutableBoolean
        mutableBoolean.setTrue();
        if (mutableBoolean.isTrue()) {
            System.out.println("The condition is true.");
        }

        // Write operation for MutableDouble
        /* write */ mutableDouble.setValue(42.0);

        // Additional logic and operations
        double result = mutableInt.getValue() * 2.5;
        System.out.println("Result of computation: " + result);

        // More complex logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Read operation for MutableDouble
        /* read */ double value = mutableDouble.getValue();
        System.out.println("MutableDouble value: " + value);
    }
}