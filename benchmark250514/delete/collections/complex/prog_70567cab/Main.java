import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer<Integer> buffer = new CircularFifoBuffer<>(5);
        List<String> stringList = new ArrayList<>();
        Map<String, Integer> stringMap = new HashMap<>();

        /* write */ buffer.add(42);

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        stringMap.put("A", 1);
        stringMap.put("B", 2);
        stringMap.put("C", 3);

        int sum = 0;
        for (Integer value : stringMap.values()) {
            sum += value;
        }

        for (String str : stringList) {
            System.out.println(str);
        }

        /* read */ int value = buffer.get();
        System.out.println("Buffer value: " + value);

        System.out.println("Sum of map values: " + sum);

        CircularFifoBuffer<String> stringBuffer = new CircularFifoBuffer<>(3);
        stringBuffer.add("Alpha");
        stringBuffer.add("Beta");
        stringBuffer.add("Gamma");

        for (Object obj : stringBuffer) {
            System.out.println(obj);
        }
    }
}