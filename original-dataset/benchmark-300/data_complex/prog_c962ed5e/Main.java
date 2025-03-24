import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        /* write */ set.add("testValue");
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println("Contains 'testValue': " + containsValue);
        CopyOnWriteArraySet<Integer> numberSet = new CopyOnWriteArraySet<>();
        for (int num : numbers) {
            numberSet.add(num);
        }
        for (int num : numberSet) {
            System.out.println("Number in set: " + num);
        }
    }
}