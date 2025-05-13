import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original MutableFloat usage
        MutableFloat mutableFloat = new MutableFloat();
        /* write */ mutableFloat.setValue(10.5f);

        // Additional code making use of MutableInt
        MutableInt mutableInt = new MutableInt();
        mutableInt.setValue(100);
        
        // Using ArrayList for storing values
        ArrayList<Float> floatList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        
        // Adding elements to lists
        floatList.add(mutableFloat.getValue());
        intList.add(mutableInt.getValue());

        // Performing some operations on the lists
        for (int i = 0; i < 5; i++) {
            floatList.add(floatList.get(0) + i);
            intList.add(intList.get(0) + i * 10);
        }

        // Printing the contents of the lists
        System.out.println("Float List:");
        for (Float f : floatList) {
            System.out.println(f);
        }

        System.out.println("Integer List:");
        for (Integer i : intList) {
            System.out.println(i);
        }

        // Some unrelated calculations
        int sum = 0;
        for (Integer i : intList) {
            sum += i;
        }
        System.out.println("Sum of integers: " + sum);

        // Final read operation for the original MutableFloat
        /* read */ float value = mutableFloat.getValue();
        System.out.println("Final value from MutableFloat: " + value);
    }
}