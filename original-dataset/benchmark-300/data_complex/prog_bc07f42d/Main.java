import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        set.add(randomNumber);
        System.out.println("Added random number: " + randomNumber);

        /* write */ set.add(42);
        System.out.println("Added number 42 to the set");

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            set.add(num);
            System.out.println("Added number " + num + " to the set");
        }

        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Set contains 42: " + containsValue);

        System.out.println("All elements in the set:");
        for (Integer num : set) {
            System.out.println(num);
        }

        int searchNumber = random.nextInt(100);
        boolean containsSearchNumber = set.contains(searchNumber);
        System.out.println("Set contains " + searchNumber + ": " + containsSearchNumber);
    }
}