import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        /* write */ builder.add(42);
        for (int i = 0; i < 5; i++) {
            builder.add(i * 10);
        }

        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        setBuilder.add("Hello");
        setBuilder.add("World");
        ImmutableSet<String> set = setBuilder.build();

        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);

        ImmutableList<Integer> list = builder.build();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }

        for (String str : set) {
            System.out.println("Set element: " + str);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);
    }
}