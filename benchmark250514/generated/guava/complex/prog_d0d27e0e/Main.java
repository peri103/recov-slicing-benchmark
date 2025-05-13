import com.google.common.collect.LinkedListMultimap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        LinkedListMultimap<String, String> stringMultimap = LinkedListMultimap.create();
        ArrayList<Integer> numberList = new ArrayList<>();
        
        // Adding unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
            stringMultimap.put("numbers", "Number: " + i);
        }
        
        // Using a different write-read pair
        stringMultimap.put("greeting", "Hello, World!");
        List<String> greetings = stringMultimap.get("greeting");
        System.out.println(greetings.get(0));
        
        /* write */ multimap.put("key", 42);
        
        // Additional operations
        numberList.add(100);
        numberList.add(200);
        
        // Iterating and printing values from numberList
        for (Integer num : numberList) {
            System.out.println("Number: " + num);
        }
        
        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values.get(0));
        
        // More complex operations
        if (!numberList.isEmpty()) {
            int sum = 0;
            for (int num : numberList) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
        }
    }
}