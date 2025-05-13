import org.apache.commons.lang3.mutable.MutableShort;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original MutableShort usage
        MutableShort mutableShort = new MutableShort();
        /* write */ mutableShort.setValue((short) 10);
        
        // Additional complexity with MutableInt
        MutableInt mutableInt = new MutableInt(100);
        mutableInt.add(50); // Increment by 50
        int intValue = mutableInt.getValue();
        System.out.println("MutableInt value: " + intValue);

        // Using ArrayList to store different types of Mutable objects
        ArrayList<Object> mutableList = new ArrayList<>();
        mutableList.add(mutableShort);
        mutableList.add(mutableInt);

        // Processing the list
        for (Object obj : mutableList) {
            if (obj instanceof MutableShort) {
                System.out.println("MutableShort found in list.");
            } else if (obj instanceof MutableInt) {
                System.out.println("MutableInt found in list.");
            }
        }

        // More operations to increase complexity
        MutableShort anotherShort = new MutableShort((short) 20);
        anotherShort.add((short) 5);
        System.out.println("Another MutableShort value: " + anotherShort.getValue());

        // Final read operation for the original MutableShort
        /* read */ short value = mutableShort.getValue();
        System.out.println("Original MutableShort value: " + value);
    }
}