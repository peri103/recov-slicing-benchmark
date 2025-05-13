import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
        ArrayListMultimap<String, Integer> arrayListMultimap = ArrayListMultimap.create();

        arrayListMultimap.put("numbers", 1);
        arrayListMultimap.put("numbers", 2);
        arrayListMultimap.put("numbers", 3);

        /* write */ multimap.put("key", "value");

        int sum = 0;
        for (Integer number : arrayListMultimap.get("numbers")) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        multimap.put("anotherKey", "anotherValue");
        multimap.put("key", "anotherValue");
        
        int count = 0;
        for (String val : multimap.get("key")) {
            count++;
        }
        System.out.println("Count of values for 'key': " + count);

        /* read */ String value = multimap.get("key").get(0);
        System.out.println(value);

        arrayListMultimap.put("moreNumbers", 4);
        arrayListMultimap.put("moreNumbers", 5);

        int product = 1;
        for (Integer number : arrayListMultimap.get("moreNumbers")) {
            product *= number;
        }
        System.out.println("Product of moreNumbers: " + product);
    }
}