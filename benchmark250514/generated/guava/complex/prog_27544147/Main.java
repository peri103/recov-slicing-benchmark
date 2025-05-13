import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set<Integer> baseSet = new HashSet<>();
        ForwardingSet<Integer> forwardingSet = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return baseSet;
            }
        };

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println(str);
        }

        /* write */ forwardingSet.add(42);

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        for (int num : numberList) {
            System.out.println("Number: " + num);
        }

        boolean containsValue = false;
        if (numberList.contains(40)) {
            System.out.println("40 is in the list");
        } else {
            System.out.println("40 is not in the list");
        }

        // Some additional operations
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");

        if (stringSet.contains("Banana")) {
            System.out.println("Banana is in the set");
        }

        /* read */ containsValue = forwardingSet.contains(42);
        System.out.println(containsValue);
    }
}