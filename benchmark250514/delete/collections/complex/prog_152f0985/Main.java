import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer<Integer> buffer = new CircularFifoBuffer<>(10);
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> nameToAge = new HashMap<>();

        names.add("Alice");
        names.add("Bob");
        nameToAge.put("Alice", 30);
        nameToAge.put("Bob", 25);

        /* write */ buffer.add(42);

        for (String name : names) {
            int age = nameToAge.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);

        /* read */ Integer value = buffer.get();
        System.out.println("Value from buffer: " + value);

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 3);
        }

        for (Integer num : numberList) {
            System.out.println("Number from list: " + num);
        }
    }
}