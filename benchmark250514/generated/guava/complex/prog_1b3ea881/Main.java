import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ImmutableList.Builder<Integer> builder = new ImmutableList.Builder<>();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        stringList.add("Hello");
        stringList.add("World");
        map.put("Key1", 100);
        map.put("Key2", 200);

        /* write */ builder.add(1);
        ImmutableList<Integer> list = builder.build();

        for (String str : stringList) {
            System.out.println("String List Item: " + str);
        }

        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        /* read */ int value = list.get(0);
        System.out.println("Read Value: " + value);

        int result = sum * 2;
        System.out.println("Result: " + result);

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        for (int num : numberList) {
            System.out.println("Number List Item: " + num);
        }
    }
}