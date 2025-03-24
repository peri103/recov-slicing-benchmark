import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        // Initialize arrayList with random values
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }

        // Add some elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(50));
        }

        // Perform the original write operation
        /* write */ list.add(42);

        // Perform some unrelated operations
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of arrayList elements: " + sum);

        // Add more elements to the LinkedList
        list.add(99);
        list.add(101);

        // Perform some more unrelated operations
        int product = 1;
        for (int num : list) {
            product *= num;
        }
        System.out.println("Product of LinkedList elements: " + product);

        // Perform the original read operation
        /* read */ int value = list.get(list.size() - 3); // 42 is the third last element now
        System.out.println("Read value: " + value);

        // Additional unrelated code
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}