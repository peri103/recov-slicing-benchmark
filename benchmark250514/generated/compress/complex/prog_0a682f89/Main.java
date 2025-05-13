import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example");
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> nameLengths = new HashMap<>();

        // Adding some names to the list
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Calculating lengths of names and storing in the map
        for (String name : namesList) {
            nameLengths.put(name, name.length());
        }

        // Setting a link name using the TarArchiveEntry class
        /* write */ entry.setLinkName("linkNameExample");

        // Performing some operations on the map
        for (String name : namesList) {
            System.out.println("Length of " + name + ": " + nameLengths.get(name));
        }

        // Adding more names to the list
        namesList.add("David");
        namesList.add("Eve");

        // Again calculating lengths of names and updating the map
        for (String name : namesList) {
            nameLengths.put(name, name.length());
        }

        // Reading the link name using the TarArchiveEntry class
        /* read */ String linkName = entry.getLinkName();
        System.out.println("Link Name: " + linkName);

        // Displaying all name lengths
        for (String name : namesList) {
            System.out.println("Updated Length of " + name + ": " + nameLengths.get(name));
        }
    }
}