import org.apache.commons.collections4.bag.TreeBag;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeBag<Integer> bag = new TreeBag<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        System.out.println("Sum of values in map: " + sum);
        
        /* write */ bag.add(5);
        
        TreeBag<String> stringBag = new TreeBag<>();
        stringBag.add("Hello");
        stringBag.add("World");
        
        System.out.println("Elements in stringBag:");
        for (String element : stringBag.uniqueSet()) {
            System.out.println(element + ": " + stringBag.getCount(element));
        }
        
        int product = 1;
        for (Integer value : map.values()) {
            product *= value;
        }
        
        System.out.println("Product of values in map: " + product);
        
        /* read */ int count = bag.getCount(5);
        System.out.println("Count of 5 in bag: " + count);
        
        TreeBag<Double> doubleBag = new TreeBag<>();
        doubleBag.add(2.5);
        doubleBag.add(3.5);
        
        System.out.println("Elements in doubleBag:");
        for (Double element : doubleBag.uniqueSet()) {
            System.out.println(element + ": " + doubleBag.getCount(element));
        }
    }
}