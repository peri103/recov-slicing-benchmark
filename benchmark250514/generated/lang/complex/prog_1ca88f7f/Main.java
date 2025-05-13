import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableInt mutableInt = new MutableInt();
        MutableDouble mutableDouble = new MutableDouble();
        MutableBoolean mutableBoolean = new MutableBoolean();

        // Complex operations with mutableDouble
        mutableDouble.setValue(3.14);
        double pi = mutableDouble.getValue();
        System.out.println("Pi: " + pi);

        // Complex operations with mutableBoolean
        mutableBoolean.setTrue();
        boolean isTrue = mutableBoolean.isTrue();
        System.out.println("Boolean is true: " + isTrue);

        // Perform arithmetic operations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Sum from 0 to 9: " + result);

        // Use conditional logic
        if (result > 20) {
            System.out.println("Result is greater than 20");
        } else {
            System.out.println("Result is not greater than 20");
        }

        // Use a loop to manipulate mutableInt
        for (int i = 0; i < 5; i++) {
            mutableInt.add(i);
        }

        // More complex logic before final read
        int threshold = 10;
        int adjustedValue = mutableInt.getValue() - threshold;
        System.out.println("Adjusted Value: " + adjustedValue);

        // Write operation
        /* write */ mutableInt.setValue(42);

        // Additional operations
        mutableInt.increment();

        // Read operation
        /* read */ int value = mutableInt.getValue();
        System.out.println("Final Value: " + value);
    }
}