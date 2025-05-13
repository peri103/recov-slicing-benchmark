import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.RangeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<String, Integer> sampleMap = new HashMap<>();
        List<String> valueList = new ArrayList<>();

        sampleMap.put("Key1", 100);
        sampleMap.put("Key2", 200);
        valueList.add("ValueA");
        valueList.add("ValueB");
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");

        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            System.out.println("SampleMap Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        for (String value : valueList) {
            System.out.println("ValueList Entry: " + value);
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        /* read */ String value = rangeMap.get(5);

        System.out.println("Read from rangeMap: " + value);

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        for (int number : numberList) {
            System.out.println("NumberList Entry: " + number);
        }
    }
}