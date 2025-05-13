import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset.Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableMultiset.builder();
        
        // Adding elements to ImmutableSet
        ImmutableSet<String> immutableSet = ImmutableSet.of("banana", "orange");
        System.out.println("ImmutableSet: " + immutableSet);

        // Adding elements to ImmutableList
        ImmutableList<String> immutableList = ImmutableList.of("grape", "melon");
        System.out.println("ImmutableList: " + immutableList);
        
        /* write */ builder.add("apple");
        
        // Performing some operations with ImmutableMultiset
        builder.add("banana").add("orange").add("apple");
        ImmutableMultiset<String> multiset = builder.build();
        
        // Count elements in multiset
        int bananaCount = multiset.count("banana");
        System.out.println("Banana Count: " + bananaCount);
        
        // More complex operations on multiset
        int orangeCount = multiset.count("orange");
        System.out.println("Orange Count: " + orangeCount);
        
        // Some unrelated operations
        int grapeCount = multiset.count("grape");
        System.out.println("Grape Count: " + grapeCount);
        
        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple Count: " + appleCount);
        
        // Further unrelated operations
        int melonCount = multiset.count("melon");
        System.out.println("Melon Count: " + melonCount);
    }
}