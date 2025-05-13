import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new HashSet<String>());
        ListOrderedSet<String> anotherSet = ListOrderedSet.listOrderedSet(new HashSet<String>());
        ArrayList<Integer> numbers = new ArrayList<>();
        
        /* write */ set.add("Hello, World!");
        
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        anotherSet.add("This is a test.");
        anotherSet.add("Another string.");
        
        for (String str : anotherSet) {
            set.add(str);
        }
        
        System.out.println("Numbers in the list:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("Strings in the set:");
        for (String str : set) {
            System.out.println(str);
        }
        
        /* read */ String value = set.get(0);
        System.out.println("First element in the set: " + value);
        
        ListOrderedSet<Integer> integerSet = ListOrderedSet.listOrderedSet(new HashSet<Integer>());
        for (int i = 0; i < 3; i++) {
            integerSet.add(i * 100);
        }
        
        System.out.println("Integers in the ordered set:");
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
        
        int sum = 0;
        for (Integer integer : integerSet) {
            sum += integer;
        }
        
        System.out.println("Sum of integers in the ordered set: " + sum);
    }
}