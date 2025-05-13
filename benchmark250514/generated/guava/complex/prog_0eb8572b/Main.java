import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Set<String> originalSet = new HashSet<>();
        ForwardingSet<String> forwardingSet = new ForwardingSet<String>() {
            @Override
            protected Set<String> delegate() {
                return originalSet;
            }
        };

        // Additional code to make the program more complex
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        /* write */ forwardingSet.add("Hello");
        
        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("Size of stringList: " + stringList.size());
        
        /* read */ boolean containsValue = forwardingSet.contains("Hello");
        System.out.println("ForwardingSet contains 'Hello': " + containsValue);
        
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 5; i < 15; i++) {
            integerSet.add(i);
        }
        
        for (int num : integerSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isTenPresent = integerSet.contains(10);
        System.out.println("IntegerSet contains 10: " + isTenPresent);
    }
}