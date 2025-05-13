import org.apache.commons.lang3.mutable.MutableShort;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableShort mutableShort = new MutableShort((short) 0);
        MutableInt mutableInt = new MutableInt(0);
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        
        // Performing some operations with MutableInt
        mutableInt.setValue(100);
        int intValue = mutableInt.getValue();
        System.out.println("MutableInt value: " + intValue);

        // Performing some operations with MutableBoolean
        mutableBoolean.setTrue();
        boolean boolValue = mutableBoolean.isTrue();
        System.out.println("MutableBoolean value: " + boolValue);

        // Original write operation
        /* write */ mutableShort.setValue((short) 42);

        // Some additional logic to increase complexity
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                mutableInt.add(i);
            } else {
                mutableInt.subtract(i);
            }
        }
        System.out.println("Updated MutableInt value: " + mutableInt.getValue());

        // Conditional logic with MutableBoolean
        if (mutableBoolean.isTrue()) {
            mutableBoolean.setFalse();
        } else {
            mutableBoolean.setTrue();
        }
        System.out.println("Updated MutableBoolean value: " + mutableBoolean.isTrue());

        // Original read operation
        /* read */ short value = mutableShort.getValue();
        System.out.println("MutableShort value: " + value);

        // Final operations to demonstrate complexity
        mutableInt.increment();
        mutableBoolean.setTrue();
        System.out.println("Final MutableInt value: " + mutableInt.getValue());
        System.out.println("Final MutableBoolean value: " + mutableBoolean.isTrue());
    }
}