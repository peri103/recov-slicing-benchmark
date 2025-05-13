import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableFloat mutableFloat = new MutableFloat();
        MutableInt mutableInt = new MutableInt();
        MutableBoolean mutableBoolean = new MutableBoolean();
        
        // Setting initial values
        mutableInt.setValue(42);
        mutableBoolean.setValue(true);
        
        // Performing some operations
        mutableInt.add(8);
        mutableBoolean.setValue(!mutableBoolean.booleanValue());
        
        // Writing to mutableFloat
        /* write */ mutableFloat.setValue(3.14f);
        
        // More operations
        System.out.println("MutableInt: " + mutableInt.getValue());
        System.out.println("MutableBoolean: " + mutableBoolean.getValue());
        
        // Conditional logic
        if (mutableBoolean.booleanValue()) {
            mutableInt.add(10);
        } else {
            mutableInt.subtract(5);
        }
        
        // Reading from mutableFloat
        /* read */ float value = mutableFloat.getValue();
        System.out.println("MutableFloat: " + value);
        
        // Final operations
        mutableInt.multiply(2);
        System.out.println("Final MutableInt: " + mutableInt.getValue());
    }
}