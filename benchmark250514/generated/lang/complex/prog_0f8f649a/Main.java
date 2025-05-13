import org.apache.commons.lang3.mutable.MutableByte;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableDouble;

public class Main {
    public static void main(String[] args) {
        MutableByte mutableByte = new MutableByte();
        MutableInt mutableInt = new MutableInt();
        MutableDouble mutableDouble = new MutableDouble();

        /* write */ mutableByte.setValue((byte) 42);

        mutableInt.setValue(100);
        mutableDouble.setValue(3.14);

        int intValue = mutableInt.getValue();
        double doubleValue = mutableDouble.getValue();

        intValue += 50;
        doubleValue *= 2;

        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        // Some complex operations
        int result = intValue * 2;
        double doubleResult = doubleValue / 2;

        for (int i = 0; i < 5; i++) {
            result += i;
            doubleResult -= i * 0.5;
        }

        System.out.println("Complex Int Result: " + result);
        System.out.println("Complex Double Result: " + doubleResult);

        /* read */ byte value = mutableByte.getValue();
        System.out.println("Byte Value: " + value);
    }
}