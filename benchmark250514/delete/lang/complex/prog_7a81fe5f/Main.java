import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableDouble;

public class Main {
    public static void main(String[] args) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        MutableInt mutableInt = new MutableInt(10);
        MutableDouble mutableDouble = new MutableDouble(5.5);

        // Perform some operations with MutableInt
        mutableInt.add(5);
        System.out.println("MutableInt value: " + mutableInt.getValue());

        // Perform some operations with MutableDouble
        mutableDouble.subtract(1.5);
        System.out.println("MutableDouble value: " + mutableDouble.getValue());

        // Complex operations involving both MutableInt and MutableDouble
        double combinedValue = mutableInt.getValue() * mutableDouble.getValue();
        System.out.println("Combined value: " + combinedValue);

        // Set value for MutableBoolean
        /* write */ mutableBoolean.setValue(true);

        // More operations with MutableInt
        mutableInt.increment();
        System.out.println("Incremented MutableInt value: " + mutableInt.getValue());

        // More operations with MutableDouble
        mutableDouble.multiply(2);
        System.out.println("Doubled MutableDouble value: " + mutableDouble.getValue());

        // Read value from MutableBoolean
        /* read */ boolean value = mutableBoolean.getValue();
        System.out.println("MutableBoolean value: " + value);

        // Final operations to add complexity
        MutableInt anotherInt = new MutableInt(20);
        anotherInt.add(mutableInt.getValue());
        System.out.println("Another MutableInt value: " + anotherInt.getValue());

        MutableDouble anotherDouble = new MutableDouble(3.3);
        anotherDouble.add(mutableDouble.getValue());
        System.out.println("Another MutableDouble value: " + anotherDouble.getValue());
    }
}