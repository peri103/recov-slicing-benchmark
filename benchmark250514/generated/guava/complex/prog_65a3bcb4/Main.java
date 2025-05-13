import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.ImmutableMultiset;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Multiset<String> anotherMultiset = HashMultiset.create();
        
        /* write */ multiset.add("example");
        
        multiset.add("test");
        multiset.add("example");
        anotherMultiset.add("example");
        anotherMultiset.add("another");
        
        int initialCount = multiset.count("example");
        System.out.println("Initial count of 'example': " + initialCount);
        
        multiset.add("test");
        multiset.add("test");
        
        ImmutableMultiset<String> immutableMultiset = ImmutableMultiset.copyOf(multiset);
        
        for (String element : immutableMultiset.elementSet()) {
            System.out.println(element + ": " + immutableMultiset.count(element));
        }
        
        /* read */ int count = multiset.count("example");
        System.out.println("Final count of 'example': " + count);
        
        multiset.add("newElement");
        anotherMultiset.add("newElement");
        
        for (String element : multiset.elementSet()) {
            System.out.println(element + " count in multiset: " + multiset.count(element));
        }
        
        for (String element : anotherMultiset.elementSet()) {
            System.out.println(element + " count in anotherMultiset: " + anotherMultiset.count(element));
        }
    }
}