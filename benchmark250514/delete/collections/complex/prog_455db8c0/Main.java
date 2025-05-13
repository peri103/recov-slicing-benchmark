import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        MultiValuedMap<String, Integer> multiMap = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMultiMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(multiMap);
        
        /* write */ multiMap.put("key", 42);
        
        // Additional code to make the program more complex
        Bag<String> bag = new HashBag<>();
        bag.add("apple");
        bag.add("banana", 2);
        bag.add("orange");
        
        System.out.println("Bag contents:");
        for (String fruit : bag.uniqueSet()) {
            System.out.println(fruit + ": " + bag.getCount(fruit));
        }
        
        multiMap.put("anotherKey", 100);
        multiMap.put("anotherKey", 200);
        
        System.out.println("MultiMap values for 'anotherKey':");
        for (Integer val : multiMap.get("anotherKey")) {
            System.out.println(val);
        }
        
        // More complex operations
        Bag<Integer> numberBag = new HashBag<>();
        numberBag.add(5);
        numberBag.add(10, 3);
        numberBag.add(20);
        
        System.out.println("Number Bag contents:");
        for (Integer number : numberBag.uniqueSet()) {
            System.out.println(number + ": " + numberBag.getCount(number));
        }
        
        // Original read operation
        /* read */ Integer value = unmodifiableMultiMap.get("key").iterator().next();
        
        System.out.println("Read value: " + value);
        
        // Additional operations
        numberBag.add(15);
        numberBag.remove(10, 2);
        
        System.out.println("Updated Number Bag contents:");
        for (Integer number : numberBag.uniqueSet()) {
            System.out.println(number + ": " + numberBag.getCount(number));
        }
    }
}