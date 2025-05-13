import com.google.common.collect.TreeMultiset;
import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        // Initialize TreeMultiset
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        /* write */ multiset.add(42);
        
        // Initialize another Multiset
        HashMultiset<String> stringMultiset = HashMultiset.create();
        stringMultiset.add("apple");
        stringMultiset.add("banana");
        stringMultiset.add("apple");
        
        // Perform some operations on stringMultiset
        int appleCount = stringMultiset.count("apple");
        System.out.println("Apple count: " + appleCount);
        
        // Add more elements to TreeMultiset
        multiset.add(15);
        multiset.add(42);
        multiset.add(7);
        
        // Perform calculations using TreeMultiset
        int sum = 0;
        for (Integer num : multiset.elementSet()) {
            sum += num * multiset.count(num);
        }
        System.out.println("Sum of elements: " + sum);
        
        // Perform some unrelated calculations
        int unrelatedSum = 0;
        for (int i = 0; i < 10; i++) {
            unrelatedSum += i * i;
        }
        System.out.println("Unrelated sum: " + unrelatedSum);
        
        // Finally read the count of the original element
        /* read */ int count = multiset.count(42);
        System.out.println("Count of 42: " + count);
    }
}