import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setComment("This is a comment.");

        // Additional complex code
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (String str : stringList) {
            System.out.println("Processing: " + str);
            if (map.containsKey(str)) {
                System.out.println("Found in map: " + map.get(str));
            } else {
                System.out.println("Not found in map.");
            }
        }

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Reading the comment from the JarArchiveEntry
        /* read */ String comment = entry.getComment();
        System.out.println("Comment from JarArchiveEntry: " + comment);

        // Adding more complexity with nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop iteration: " + i + ", " + j);
            }
        }
    }
}