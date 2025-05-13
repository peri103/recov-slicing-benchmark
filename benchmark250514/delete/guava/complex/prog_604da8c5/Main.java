import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, String> multimap = HashMultimap.create();
        HashMultimap<String, Integer> multimap2 = HashMultimap.create();
        
        multimap2.put("keyA", 100);
        multimap2.put("keyB", 200);
        
        for (String key : multimap2.keySet()) {
            for (Integer value : multimap2.get(key)) {
                System.out.println("multimap2: " + key + " -> " + value);
            }
        }
        
        /* write */ multimap.put("key1", "value1");

        HashMultimap<String, String> multimap3 = HashMultimap.create();
        multimap3.put("keyX", "valueX");
        multimap3.put("keyY", "valueY");
        
        for (String key : multimap3.keySet()) {
            for (String value : multimap3.get(key)) {
                System.out.println("multimap3: " + key + " -> " + value);
            }
        }
        
        /* read */ String value = multimap.get("key1").iterator().next();
        System.out.println("multimap: key1 -> " + value);
        
        multimap.put("key2", "value2");
        multimap.put("key3", "value3");
        
        for (String key : multimap.keySet()) {
            for (String val : multimap.get(key)) {
                System.out.println("multimap: " + key + " -> " + val);
            }
        }
        
        HashMultimap<String, Double> multimap4 = HashMultimap.create();
        multimap4.put("keyP", 3.14);
        multimap4.put("keyQ", 2.71);
        
        for (String key : multimap4.keySet()) {
            for (Double value : multimap4.get(key)) {
                System.out.println("multimap4: " + key + " -> " + value);
            }
        }
    }
}