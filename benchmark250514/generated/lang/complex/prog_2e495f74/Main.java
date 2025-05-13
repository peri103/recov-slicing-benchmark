import org.apache.commons.lang3.mutable.MutableLong;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MutableLong mutableLong = new MutableLong();
        MutableInt mutableInt = new MutableInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Perform operations with MutableInt
        mutableInt.setValue(10);
        int intValue = mutableInt.getValue();
        arrayList.add(intValue);
        
        /* write */ mutableLong.setValue(42L);

        // Perform operations with ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 2);
        }
        
        // Process the ArrayList
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of elements in arrayList: " + sum);

        // More operations
        int maxValue = Integer.MIN_VALUE;
        for (Integer num : arrayList) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("Max value in arrayList: " + maxValue);

        /* read */ long value = mutableLong.getValue();
        System.out.println("MutableLong value: " + value);
    }
}