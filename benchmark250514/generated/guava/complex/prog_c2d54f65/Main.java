import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Original ForwardingList setup
        List<Integer> backingList = new ArrayList<>();
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return backingList;
            }
        };
        
        // Additional list for more operations
        List<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        // Another ForwardingList for more complexity
        List<Double> doubleBackingList = new ArrayList<>();
        ForwardingList<Double> doubleList = new ForwardingList<Double>() {
            @Override
            protected List<Double> delegate() {
                return doubleBackingList;
            }
        };
        
        // Populate the double list
        doubleList.add(3.14);
        doubleList.add(2.71);
        
        // Operations on string list
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Operations on double list
        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println("Double value: " + doubleList.get(i));
        }
        
        // Original write operation
        /* write */ list.add(42);
        
        // Unrelated computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Additional operations on the original list
        list.add(100);
        list.add(200);
        
        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        // Original read operation
        /* read */ int value = list.get(0);
        System.out.println("Read value from list: " + value);
        
        // Final operations
        System.out.println("Final list contents:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}