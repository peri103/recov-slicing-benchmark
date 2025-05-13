import com.google.common.collect.TreeMultiset;
import com.google.common.collect.HashMultiset;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        HashMultiset<String> hashMultiset = HashMultiset.create();
        
        /* write */ multiset.add(10);
        
        // Adding elements to HashMultiset
        hashMultiset.add("apple");
        hashMultiset.add("banana");
        hashMultiset.add("apple");
        
        // Performing operations on HashMultiset
        int appleCount = hashMultiset.count("apple");
        int bananaCount = hashMultiset.count("banana");
        
        System.out.println("Apple count in HashMultiset: " + appleCount);
        System.out.println("Banana count in HashMultiset: " + bananaCount);
        
        // More operations on TreeMultiset
        multiset.add(20);
        multiset.add(30);
        multiset.add(10);
        
        int totalCount = multiset.size();
        System.out.println("Total elements in TreeMultiset: " + totalCount);
        
        // Performing calculations
        int sum = 0;
        for (Integer number : multiset) {
            sum += number;
        }
        System.out.println("Sum of elements in TreeMultiset: " + sum);
        
        /* read */ int count = multiset.count(10);
        System.out.println("Count of number 10 in TreeMultiset: " + count);
        
        // Adding more complexity
        HashMultiset<Integer> numberMultiset = HashMultiset.create();
        for (int i = 1; i <= 5; i++) {
            numberMultiset.add(i);
            numberMultiset.add(i * 2);
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count of number " + i + " in numberMultiset: " + numberMultiset.count(i));
        }
    }
}