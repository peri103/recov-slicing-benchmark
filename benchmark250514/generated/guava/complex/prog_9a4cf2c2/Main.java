import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        Map<String, Integer> fruitCountMap = new HashMap<>();

        /* write */ builder.add("apple");
        builder.add("banana");
        builder.add("orange");

        listBuilder.add(10);
        listBuilder.add(20);
        listBuilder.add(30);

        ImmutableMultiset<String> multiset = builder.build();
        ImmutableList<Integer> numbers = listBuilder.build();

        for (String fruit : multiset.elementSet()) {
            fruitCountMap.put(fruit, multiset.count(fruit));
        }

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple Count: " + appleCount);

        int totalFruitCount = 0;
        for (Integer count : fruitCountMap.values()) {
            totalFruitCount += count;
        }

        System.out.println("Total Fruit Count: " + totalFruitCount);
    }
}