import org.apache.commons.lang3.mutable.MutableLong;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        MutableLong mutableLong = new MutableLong();
        /* write */ mutableLong.setValue(123456789L);

        // Additional code to add complexity
        MutableInt mutableInt = new MutableInt();
        mutableInt.setValue(42);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }

        for (int number : numbers) {
            mutableInt.add(number);
        }

        int intValue = mutableInt.getValue();
        System.out.println("MutableInt value after additions: " + intValue);

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum of numbers: " + sum);

        // Final read operation from the original write-read pair
        /* read */ long value = mutableLong.getValue();
        System.out.println("MutableLong value: " + value);
    }
}