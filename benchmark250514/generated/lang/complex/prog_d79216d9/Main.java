import org.apache.commons.lang3.mutable.MutableLong;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableLong mutableLong = new MutableLong();
        MutableInt mutableInt = new MutableInt(10);
        MutableBoolean mutableBoolean = new MutableBoolean(true);
        
        // Complex logic involving mutableInt
        int sum = 0;
        for (int i = 0; i < mutableInt.getValue(); i++) {
            sum += i;
        }
        mutableInt.setValue(sum);

        // Conditional logic using mutableBoolean
        if (mutableBoolean.isTrue()) {
            System.out.println("The boolean is true, proceeding with operations.");
        }

        /* write */ 
        mutableLong.setValue(12345L);  // Original write operation
        
        // More operations
        mutableInt.increment();
        mutableBoolean.setFalse();

        // Some complex arithmetic
        int result = mutableInt.getValue() * 2;
        System.out.println("Result of complex arithmetic: " + result);

        // Final read operation
        /* read */ 
        long value = mutableLong.getValue();  // Original read operation
        System.out.println(value);

        // Additional logic to make the program more complex
        if (mutableBoolean.isFalse()) {
            System.out.println("The boolean is now false.");
        }
    }
}