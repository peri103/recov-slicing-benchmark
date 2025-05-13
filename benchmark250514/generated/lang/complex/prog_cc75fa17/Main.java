import org.apache.commons.lang3.mutable.MutableShort;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableDouble;

public class Main {
    public static void main(String[] args) {
        MutableShort mutableShort = new MutableShort();
        MutableInt mutableInt = new MutableInt();
        MutableDouble mutableDouble = new MutableDouble();

        mutableInt.setValue(100);
        System.out.println("Initial Int Value: " + mutableInt.getValue());

        mutableDouble.setValue(20.5);
        System.out.println("Initial Double Value: " + mutableDouble.getValue());

        /* write */ mutableShort.setValue((short) 42);

        for (int i = 0; i < 5; i++) {
            mutableInt.setValue(mutableInt.getValue() + i);
            mutableDouble.setValue(mutableDouble.getValue() + (i * 1.1));
        }

        System.out.println("Updated Int Value: " + mutableInt.getValue());
        System.out.println("Updated Double Value: " + mutableDouble.getValue());

        /* read */ short value = mutableShort.getValue();
        
        System.out.println("MutableShort Value: " + value);

        for (int i = 0; i < 3; i++) {
            mutableInt.setValue(mutableInt.getValue() - i);
        }

        System.out.println("Final Int Value: " + mutableInt.getValue());
    }
}