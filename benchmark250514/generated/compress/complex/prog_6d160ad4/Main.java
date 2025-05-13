import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setSize(1024);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ long size = jarEntry.getSize();
        System.out.println("Jar entry size: " + size);

        int product = 1;
        for (Integer num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}