import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableList.builder();
        Builder<String> stringBuilder = ImmutableList.builder();
        Map<String, Integer> map = new HashMap<>();
        
        /* write */ builder.add(1);
        stringBuilder.add("Hello");
        stringBuilder.add("World");
        map.put("key1", 100);
        map.put("key2", 200);
        
        ImmutableList<Integer> list = builder.build();
        ImmutableList<String> stringList = stringBuilder.build();
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }
        
        System.out.println("Sum of values in map: " + sum);
        
        /* read */ int value = list.get(0);
        System.out.println("Value from ImmutableList: " + value);
        
        for (int i = 0; i < 5; i++) {
            builder.add(i * 2);
        }
        
        ImmutableList<Integer> newList = builder.build();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("Number from newList: " + newList.get(i));
        }
    }
}