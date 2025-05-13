import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Create a HashMap to store some data
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        
        // Create an ArrayList to store some entries
        ArrayList<TarArchiveEntry> entryList = new ArrayList<>();
        entryList.add(new TarArchiveEntry("file1.txt"));
        entryList.add(new TarArchiveEntry("file2.txt"));
        
        // Use the write method to set the user name
        /* write */ entry.setUserName("testUser");

        // Perform some operations on the HashMap
        if (map.containsKey("Alice")) {
            int age = map.get("Alice");
            System.out.println("Alice's age: " + age);
        }
        
        // Perform some operations on the ArrayList
        for (TarArchiveEntry e : entryList) {
            e.setUserName("defaultUser");
        }
        
        // Use the read method to get the user name
        /* read */ String userName = entry.getUserName();
        
        // Print the user name to ensure it's correctly read
        System.out.println(userName);
        
        // Additional operations on ArrayList
        for (TarArchiveEntry e : entryList) {
            System.out.println("Entry user name: " + e.getUserName());
        }
        
        // Manipulate and print the HashMap
        map.put("Charlie", 35);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}