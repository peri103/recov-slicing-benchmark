import org.apache.commons.lang3.mutable.MutableByte;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MutableByte mutableByte = new MutableByte();
        MutableInt mutableInt = new MutableInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Initialize the mutableInt with a value
        mutableInt.setValue(42);
        
        // Add some numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Process the list and print the values
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.println("Number at index " + i + ": " + num);
        }
        
        // Perform a calculation using mutableInt
        int calculatedValue = mutableInt.getValue() * 2;
        System.out.println("Calculated value: " + calculatedValue);
        
        /* write */ mutableByte.setValue((byte) 100);
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Use mutableInt in another calculation
        int difference = mutableInt.getValue() - sum;
        System.out.println("Difference: " + difference);
        
        /* read */ byte value = mutableByte.getValue();
        System.out.println("MutableByte value: " + value);
        
        // Final operations
        int product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            product *= numbers.get(i);
        }
        System.out.println("Product of numbers: " + product);
    }
}