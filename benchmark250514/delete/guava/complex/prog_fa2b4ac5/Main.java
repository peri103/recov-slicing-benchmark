import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder as ListBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, String> builder = ImmutableMultimap.builder();
        /* write */ builder.put("key1", "value1");
        
        ImmutableListMultimap<String, Integer> listMultimap;
        ListBuilder<String, Integer> listBuilder = ImmutableListMultimap.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.put("numbers", i);
        }
        listMultimap = listBuilder.build();

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        ImmutableMultimap<String, String> multimap = builder.build();
        /* read */ String value = multimap.get("key1").iterator().next();
        System.out.println(value);

        for (Integer number : listMultimap.get("numbers")) {
            System.out.println("Number: " + number);
        }

        int sum = 0;
        for (Integer number : listMultimap.get("numbers")) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}