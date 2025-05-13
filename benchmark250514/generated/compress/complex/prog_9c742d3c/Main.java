import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry tarEntry = new TarArchiveEntry("");

        // Initialize a HashMap to store TarArchiveEntry objects with their names
        HashMap<String, TarArchiveEntry> tarMap = new HashMap<>();
        
        // Initialize an ArrayList to store names of entries
        ArrayList<String> nameList = new ArrayList<>();

        // Set the name of the tarEntry
        /* write */ tarEntry.setName("example.tar");
        
        // Store the tarEntry in the map with its name
        tarMap.put(tarEntry.getName(), tarEntry);
        
        // Add the name to the nameList
        nameList.add(tarEntry.getName());

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Retrieve the name from the tarEntry
        /* read */ String name = tarEntry.getName();
        
        // Print the name
        System.out.println("Tar Entry Name: " + name);

        // Perform more unrelated operations
        for (String entryName : nameList) {
            TarArchiveEntry entry = tarMap.get(entryName);
            System.out.println("Retrieved Entry Name: " + entry.getName());
        }
    }
}