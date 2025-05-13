import org.apache.commons.lang3.mutable.MutableByte;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a MutableByte and perform write and read operations
        MutableByte mutableByte = new MutableByte();
        
        // Initialize a MutableInt for additional operations
        MutableInt mutableInt = new MutableInt(100);
        
        // Initialize an ArrayList to store some values
        ArrayList<Integer> list = new ArrayList<>();
        
        // Perform some operations on MutableInt
        mutableInt.increment();
        int intValue = mutableInt.getValue();
        
        // Add values to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }
        
        // Perform write operation on MutableByte
        /* write */ mutableByte.setValue((byte) 10);
        
        // Perform operations on the list
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + intValue);
        }
        
        // Calculate sum of the list elements
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        
        // Perform read operation on MutableByte
        /* read */ byte value = mutableByte.getValue();
        
        // Output the results
        System.out.println("MutableByte Value: " + value);
        System.out.println("MutableInt Value: " + intValue);
        System.out.println("Sum of List Elements: " + sum);
    }
}