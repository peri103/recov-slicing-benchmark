import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Multiset<String> anotherMultiset = HashMultiset.create();
        Map<String, Integer> fruitMap = new HashMap<>();

        /* write */ multiset.add("apple");

        anotherMultiset.add("banana");
        anotherMultiset.add("apple");
        anotherMultiset.add("orange");
        
        fruitMap.put("banana", 2);
        fruitMap.put("apple", 3);
        fruitMap.put("orange", 1);

        for (String fruit : anotherMultiset.elementSet()) {
            System.out.println("Fruit: " + fruit + ", Count: " + anotherMultiset.count(fruit));
        }

        int appleCountInMap = fruitMap.get("apple");
        System.out.println("Apple count in map: " + appleCountInMap);

        /* read */ int count = multiset.count("apple");
        System.out.println("Apple count in multiset: " + count);

        Multiset<Integer> numberMultiset = HashMultiset.create();
        for (int i = 0; i < 5; i++) {
            numberMultiset.add(i * 2);
        }

        for (int number : numberMultiset.elementSet()) {
            System.out.println("Number: " + number + ", Count: " + numberMultiset.count(number));
        }
    }
}