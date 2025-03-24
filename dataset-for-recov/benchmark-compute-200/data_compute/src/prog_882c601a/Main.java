import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        int irrelevantCalculation = (100 + 200) * 3;
        map.put(4, "four");
        if (irrelevantCalculation % 2 == 0) {
            map.put(5, "five");
        }
        String confusingValue = map.get(3);
        boolean randomCondition = confusingValue.equals("three");
        /* write */ if (randomCondition) {
            map.put(6, "six");
        }
        map.put(7, "seven");
        map.put(8, "eight");
        if (map.containsKey(7)) {
            map.put(9, "nine");
        }
        /* read */ String ret = map.get(6);
        System.out.println("The retrieved value is: " + ret);
    }
}